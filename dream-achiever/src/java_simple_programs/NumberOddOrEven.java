/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to check whether the given number is even or odd

public class NumberOddOrEven{
    public static void main(String[] args){
        number(22);
    }
    public static void number(int num){
        int reminder = num%2;
        if(reminder%2==0){
            System.out.println("the given number is even");
        }else{
            System.out.println("the given number is odd" );
        }
        
    }
    
}

 