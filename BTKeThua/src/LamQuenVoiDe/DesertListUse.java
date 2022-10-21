/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamQuenVoiDe;

/**
 *
 * @author Administrator
 */
public class DesertListUse {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.("Print Desert");
        menu.("Add Step");
        menu.("Others: Quit");
        int choice;
        DesertList list = new DesertList();
        
        do {            
            choice = menu.getChoice();
            switch (choice) {
                case 1: list.print(); break;
                case 2: list.add(); break;
                default: System.out.println("\nGood bye!");
            }
        } while (choice > 0 && choice < 3);
    }
}
