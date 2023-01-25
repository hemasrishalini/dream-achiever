/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java Program to Find the Sum of Even Numbers

public class SumOfEvenNumber {
    public static void main(String[] args){
         evenNumber(1,100);
    }
    public static void evenNumber(int start, int end){
        int sum = 0;
        for(int i = 1; i<=100;i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of even numbers from 1-100 is: "+sum);
    }
}