/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class IntegerOfPrimeNumber {
    public static void main(String[] args){
        prime(85);
    }
    public static void prime(int num){
        boolean isprime = true;
         
        for(int i =2; i<(num/2);i++){
            if(num%i==0){
               isprime = false;
               break;
            }
        }
        if(isprime==true){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
