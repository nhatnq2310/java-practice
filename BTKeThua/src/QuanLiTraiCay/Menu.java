/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiTraiCay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Menu extends ArrayList <String> {
     public Menu(){
        super();
    }

    public void addFruit(String item) {
        add(item);
    }

    public int getChoice() {
        for (int i = 0; i < this.size(); i++)
            System.out.println((i+1) + "- " + this.get(i));
        System.out.print("Your choice? ");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    void addItem(String add_new_Fruit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
