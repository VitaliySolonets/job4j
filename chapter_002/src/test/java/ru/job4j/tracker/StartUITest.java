package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();  //создаем объект tracker.
        Item item = new Item("new item"); //создаем объект item.
        tracker.add(item); //Добавляем item в tracker.После этой операции у нас есть id.
        //Достаем item.id и создаем массив с ответами пользователя.
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("first");
        String[] answer = {item.getId()};
        StartUI.deleteItem(new StubInput(answer), tracker);
        String expected = null;
        assertThat(tracker.findById(item.getId()), is(expected));
    }
}
