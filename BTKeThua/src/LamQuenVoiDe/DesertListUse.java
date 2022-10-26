/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamQuenVoiDe;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DesertListUse {

    Scanner sc = new Scanner(System.in);

    Desert desert = new Desert("kem", 4);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Print Desert");
        menu.add("Add Step");
        menu.add("Others: Quit");
        int choice;
        DesertList list = new DesertList();

        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.printf("%15s|%15s\n", "NAME", "Step");
                    for (Desert desert : this) {
                        System.out.println(desert.toString());
                    }
                    System.out.println();
                    break;
                case 2:
                    String name;
                    do {
                        System.out.print("Enter Desertt's name: ");
                        name = sc.nextLine();
                        if (!name.matches("\\w+$")) {
                            System.out.println("Invalid value!");
                        }
                    } while (!name.matches("\\w+$"));
                    System.out.print("Enter Desert STep: ");
                    int Step = Integer.parseInt(sc.nextLine());
                    Desert newDesert = new Desert(name, Step);
                    break;
                default:
                    System.out.println("\nGood bye!");
            }
        } while (choice > 0 && choice < 3);
    }
}
