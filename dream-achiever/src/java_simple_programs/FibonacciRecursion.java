/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to find the Nth term in a Fibonacci series using recursion


public class FibonacciRecursion {
    public static void main(String[] args){
       int n = 3;
       System.out.println(number(n));
    }
    public static int number(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return number(n-1)+ number(n-2);
        }
    }
}
