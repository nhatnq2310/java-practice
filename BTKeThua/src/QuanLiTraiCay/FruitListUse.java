/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiTraiCay;

/**
 *
 * @author Administrator
 */
public class FruitListUse {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new Fruit");
        menu.add("Update Fruit based on ID");
        menu.add("Show the list in ascending order of IDs");
        menu.add("Others: Quit");
        int choice;
        FruitList list = new FruitList();
        
        do {            
            choice = menu.getChoice();
            switch (choice) {
                case 1: list.add(); break;
                case 2: list.update(); break;
                case 3: list.print(); break;
                default: System.out.println("\nGood bye!");
            }
        } while (choice > 0 && choice < 4);
    }
}
