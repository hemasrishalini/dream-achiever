/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to generate the prime numbers from 1 to N


public class PrimeNumber1ToN {
    public static void main(String[] args){
        primeNumber(72);
        
    }
    public static void primeNumber(int num){
        boolean isprime = true;
        for(int i = 2; i<(num/2);i++){
            if(num%2==0){
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
