package ru.job4j;

import java.util.*;

public class Tracker {
    /**
     * Массив для хранения заявок
     */
    public final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки
     */
    private int position = 0;

    /**
     * Метод реализующий добавление новой заявки в хранилище
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания.Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


    /**
     * Метод заменяет ячейку в массиве.
     *
     * @return boolean result удалось ли провести операцию.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                item.setId(id);
                result = true;
            }
        }
        return result;
    }

    /**
     * Метод удаляет ячейку в массиве по id. Смещая все значения справа от удаляемого элемента.
     *
     * @return true или false, удалось ли провести операцию.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.position - i - 1);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива  this.items без null элементов.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Проверяет все элементы в цикле.Сравнивая name с аргументом метода String key.
     * Элементы у которых name совпадает копирует в результирующий массив и возвращает его.
     */

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        for (int index = 0, j = 0; index < this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[j++] = (this.items[index]);
            }
        }
        return result;
    }

    /**
     * Метод находит Item с нужный id.
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0, j = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                result = this.items[index];
                break;
            }
        }
        return result;
    }


}
