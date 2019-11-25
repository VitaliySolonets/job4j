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
        /*
         * Чтобы получить текущее время в Java есть удобный метод System.currentTimeMillis()
         * чтобы получить случайное число используем объект класса Random. Метод extLong().
         *Чтобы преобразовать что угодно в String можно использовать метод класса String.valueOf()
         */
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод заменяет ячейку в массиве.
     *
     * @return boolean result удалось ли провести операцию.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;                        //вводим переменную
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {    //находим id какого элемента совпадает с входящим id
                this.items[i] = item;                  //заменяем заявку
                result = true;
            }
        }
        return result;                                 // возвращаем результат
    }

    /**
     * Метод удаляет ячейку в массиве по id. Смещая все значения справа от удаляемого элемента.
     *
     * @return true или false, удалось ли провести операцию.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
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
        List<Item> itemcoll = new ArrayList<>(); //создаем списочный массив
        Collections.addAll(itemcoll, this.items); //перобразуем в него наш простой массив заявок
        itemcoll.removeAll(Collections.singleton(null)); //удаляем элементы null
        return itemcoll.toArray(new Item[itemcoll.size()]); // возвращаем из метода проебразуя в простой массив с заданием размера без null
    }

    /**
     * Проверяет все элементы в цикле.Сравнивая name с аргументом метода String key.
     * Элементы у которых name совпадает копирует в результирующий массив и возвращает его.
     */

    public Item[] findByName(String key) {
        List<Item> list = new ArrayList<>();
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index] != null && this.items[index].getName().equals(key)) {
                list.add(this.items[index]);
            }
        }
        return list.toArray(new Item[list.size()]);
    }

    /**
     * Метод находит Item с нужный id.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }


}
