package ru.job4j;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item added.");
            } else if (select == 1) {
                System.out.println(Arrays.toString(tracker.findAll()));
            } else if (select == 2) {
                System.out.println("Please, enter the id:");
                String id = scanner.nextLine();
                tracker.findById(id);
                System.out.println("Thanks. Item edited.");
            } else if (select == 3) {
                System.out.println("Please, enter the id.");
                String id = scanner.nextLine();
                tracker.delete(id);
                System.out.println("Thanks. Item deleted.");
            } else if (select == 4) {
                System.out.println("Please, enter the id.");
                String id = scanner.nextLine();
                System.out.println(tracker.findById(id).getName());
            } else if (select == 5) {
                System.out.println("Please, enter name:");
                String name = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
