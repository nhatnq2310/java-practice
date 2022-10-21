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
    public static String toUpperCase(String sen){
        String[] ars = sen.split(" ");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String item = ars[i];
            String ch = item.substring(0,1).toUpperCase();
            item = ch + item.substring(1).toLowerCase();
            s.append(item).append(" ");
        }
        
       return s.toString().trim();
    }
    
    public static void main(String[] args){
        System.out.println(checkEven(2));
        
        String s = toUpperCase("be nhat luoi bieng");
        //Convert to UpperCase
       System.out.println(s);
    }
}
