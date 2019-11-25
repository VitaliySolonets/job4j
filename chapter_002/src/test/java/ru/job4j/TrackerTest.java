package ru.job4j;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();   //создаем объект
        Item item = new Item("test1");  // создаем заявку
        tracker.add(item); //добавляем заявку в трекер
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        //Добавляем заявку в трекер.Теперь в объекте проинициализирован id.
        tracker.add(previous);
        //Создаем новую заявку.
        Item next = new Item("test2");
        //Устанавливаем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        //Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        //Проверяем что заявка с таким id имеет новое имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItemThenNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        tracker.add(item);
        String result = item.getId();
        tracker.delete(item.getId());
        assertThat(tracker.findById(result), is(nullValue()));
    }

    @Test

    public void whenFindAllThenItemsFourElementNotIncludeNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item1 = new Item("test2");
        Item item2 = new Item("test3");
        Item item3 = new Item("test4");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findAll().length, is(4));
    }

    @Test

    public void whenFindByNameThenReturnItemsSameName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        Item item1 = new Item("test2");
        Item item2 = new Item("test");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        String key = "test";
        Item[] res = tracker.findByName(key);
        Item[] expect = new Item[2];
        expect[0] = item;
        expect[1] = item2;
        assertThat(res, is(expect));
    }

    @Test

    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        String result = item1.getId();
        assertThat(tracker.findById(result), is(item1));
    }

}


