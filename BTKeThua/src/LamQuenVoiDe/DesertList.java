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
    
    Desert desert = new Desert("kem", 4);
 
    public void print() {
        
            System.out.printf("%15s|%15s\n", "NAME", "Step");
            for (Desert desert : this) {
                System.out.println(desert.toString());
            }
            System.out.println();
        }
    
    public void update() {
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
                
            
        
    }
}
