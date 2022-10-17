/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_code;

/**
 *
 * @author Administrator
 */
public class main {
    public static boolean checkEven(int n){
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Bt 1: viet ham nhan vao string, tra ve string ma Uppercase tat ca cac chu cai dau
    // Vd: Nhap vao: "be nhat luoi bieng" -> Tra ve: "Be Nhat Luoi Bieng"
    
    
    public static void main(String[] args){
        System.out.println(checkEven(2));
        
        String s = new String("be nhat luoi bieng");
        //Convert to UpperCase
        System.out.println(s.toUpperCase());
    }
}
