package ru.job4j.tracker;

import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения данных.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище.
     *
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ заявки.
     * Так как у заявки нет уникальности полей,имени и описания.Для идентификации нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод заменяет ячейку в массиве this.items по значению уникального id.
     *
     * @return true или false
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет ячейку в массиве.Смещая все значения справа от удаляемого элемента.
     *
     * @return true или false.
     */

    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.items.length - 1);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Возвращает копию массива this.items без null элементов.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.items.length];
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].equals(null)) {
                System.arraycopy(this.items, index + 1, result, index, this.items.length - 1);
            }
        }
        return result;
    }


    public Item[] findByName(String key) {
        Item[] result = new Item[this.items.length];
        for (int index = 0; index < this.items.length; index++) {
            if (items[index].getName().equals(key)) {
                System.arraycopy(this.items, index + 1, result, index, this.items.length - 1);
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                item = items[index];
                break;
            }
        }
        return item;
    }
}
