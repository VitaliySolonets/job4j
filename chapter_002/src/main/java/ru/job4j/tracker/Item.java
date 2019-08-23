package ru.job4j.tracker;

import java.util.Objects;

/**
 * @author Vitaly Solonets (Solonets.80@mail.ru)
 * @version 0.1
 * @since 23.08.2019
 */

/**
 * Класс Item описывает бизнес модель заявки.
 */
public class Item {
    private String id;//уникальный ключ.
    private String name;//имя.

    //конструктор класса.
    public Item(String name) {
        this.name =name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
