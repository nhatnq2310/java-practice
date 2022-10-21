/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamQuenVoiDe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class DesertList extends ArrayList<Desert> {
    Scanner sc = new Scanner(System.in);
    
    Desert de = new Desert("Kem", 2);
 
    public void print() {
        if (isEmpty()) {
            System.out.println("Empty list !");
        } else {
            System.out.printf("%15s|%15s|%15s\n", "ID", "NAME", "Step");
            for (Desert desert : this) {
                System.out.println(desert.toString());
            }
            System.out.println();
        }
    }
}
