/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to display all integers within the range 100-150 whose sum of digits is an even number


public class DigitOfAnInteger {
    public static void main(String[] args){
        digitInteger(125);
    }
    public static void digitInteger(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum +digit;
            num = num/10;
        }
        System.out.println("sum of digit is:"+ sum);
    }
    
}
