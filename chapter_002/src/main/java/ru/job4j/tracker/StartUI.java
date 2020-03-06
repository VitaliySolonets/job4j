package ru.job4j.tracker;


/**
 * Консольное приложение для работы с классом ru.job4j.tracker.Tracker.
 */

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("===Create a new Item===");
        String name = input.askStr("Enter name:");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Item added.");
    }

    public static void showAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("===Edit an item.===");
        String id = input.askStr("Please enter the id.");
        String name = input.askStr("Please, enter name:");
        boolean edit = tracker.replace(id, new Item(name));
        if (edit) {
            System.out.println("Thanks. Item edited.");
        } else {
            System.out.println("The operation failed.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Please,enter the id.");
        boolean delete = tracker.delete(id);
        if (delete) {
            System.out.println("Operation is  " + delete + " Thanks. Item deleted.");
        } else {
            System.out.println("The operation failed.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        String id = input.askStr("Please,enter the id.");
        Item item = tracker.findById(id);
        System.out.println(item != null ? item.getName() : "Invalid id.");
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        String name = input.askStr("Please,enter the name:");
        //System.out.println(Arrays.toString(tracker.findByName(name)));
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");


    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
