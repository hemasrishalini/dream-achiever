/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class DigitOfAnInteger {
    public static void main(String[] args){
        integer(234);
    }
    public static void integer(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        System.out.println(("sum of digit is:" + sum));
    }
    
}
