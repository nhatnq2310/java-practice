/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Administrator
 */
public class main {
    public static void printOddToN(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void printDividedBy3(int n){
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkEven(int n){
        if (n % 2 ==0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        
        System.out.println(checkEven(100));
    }
}


