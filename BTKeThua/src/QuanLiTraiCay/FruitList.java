/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiTraiCay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FruitList extends ArrayList<Fruit> {

    Scanner sc = new Scanner(System.in);

    public int find(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (ID.equals(get(i).getID())) {
                return i;
            }
        }
        return -1;
    }

    public void add() {
        String ID;
        do {
            System.out.print("Enter Fruit's ID (Fxxx) : ");
            ID = sc.nextLine();
            if (!ID.matches("^F\\d{3}$")) {
                System.out.println("Invalid value!");
            }
            if (find(ID) != -1) {
                System.out.println("ID exist !");
            }
        } while (!ID.matches("^F\\d{3}$") || find(ID) != -1);
        String name;
        do {
            System.out.print("Enter Fruit's name: ");
            name = sc.nextLine();
            if (!name.matches("\\w+$")) {
                System.out.println("Invalid value!");
            }
        } while (!name.matches("\\w+$"));

        System.out.print("Enter Fruit's price: ");
        double price = Double.parseDouble(sc.nextLine());
        add(new Fruit(ID, name, price));
    }

    public void update() {
        if (isEmpty()) {
            System.out.println("Empty list!");
        } else {
            System.out.print("Enter Fruit's ID: ");
            String ID = sc.nextLine();
            int pos = find(ID);
            if (pos < 0) {
                System.out.println("Fruit does not exist !");
            } else {
                String name;
                do {
                    System.out.print("Enter Fruit's name: ");
                    name = sc.nextLine();
                    if (!name.matches("\\w+$")) {
                        System.out.println("Invalid value!");
                    }
                } while (!name.matches("\\w+$"));
                System.out.print("Enter Fruit's price: ");
                double price = Double.parseDouble(sc.nextLine());
                Fruit newFruit = new Fruit(ID, name, price);
                set(pos, newFruit);
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty list !");
        } else {
            Collections.sort(this);
            System.out.printf("%15s|%15s|%15s\n", "ID", "NAME", "PRICE");
            for (Fruit fruit : this) {
                System.out.println(fruit.toString());
            }
            System.out.println();
        }
    }
}
