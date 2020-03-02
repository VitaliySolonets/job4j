package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Консольное приложение для работы с классом ru.job4j.tracker.Tracker.
 */

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            // System.out.println("Select: ");
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                // System.out.println("Enter name:");
                String name = input.askStr("Enter name:");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item added.");
            } else if (select == 1) {
                System.out.println(Arrays.toString(tracker.findAll()));
            } else if (select == 2) {
                //System.out.println("Please, enter the id:");
                String id = input.askStr("Please, enter the id:");
                boolean edit = tracker.replace(id, tracker.findById(id));
                if (edit) {
                    System.out.println("Thanks. Item edited.");
                }
            } else if (select == 3) {
                // System.out.println("Please, enter the id.");
                String id = input.askStr("Please, enter the id.");
                boolean delete = tracker.delete(id);
                if (delete) {
                    System.out.println("Operation is  " + delete + " Thanks. Item deleted.");
                } else {
                    System.out.println("The operation failed.");
                }
            } else if (select == 4) {
                // System.out.println("Please, enter the id.");
                String id = input.askStr("Please, enter the id.");
                Item item = tracker.findById(id);
                System.out.println(item != null ? item.getName() : "Invalid id");

            } else if (select == 5) {
                //  System.out.println("Please, enter name:");
                String name = input.askStr("Please, enter name:");
                System.out.println(Arrays.toString(tracker.findByName(name)));
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
