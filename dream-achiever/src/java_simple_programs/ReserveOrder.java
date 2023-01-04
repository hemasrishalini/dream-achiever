/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class ReserveOrder {
    public static void main(String[] args){
      reverse(3456);  
    }
    public static int reverse(int num){
        int rev =0;
        while(num!=0){
            int digit = num%10;
            rev = (rev*10)+digit;
            num = num/10;
        }
        System.out.println(rev);
        return rev;
    }
    
}
