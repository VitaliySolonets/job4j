package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
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
        //Проставляем стары id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        //Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        //Проверяем что заявка с таким id имеет новое имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
}
