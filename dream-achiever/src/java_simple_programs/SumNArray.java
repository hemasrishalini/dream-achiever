/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to display the sum of n numbers using an array


public class SumNArray {
    public static void main(String[] args){
       int[] n = new int[]{-1,-1,-1,-1};
       System.out.println("start");
       number(n);
       System.out.println("end");
       
    }
    public static int number(int[] n){
        System.out.println("number");
        int sum = 0;
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
            sum = sum+n[i];
        }
        
        System.out.println(sum);
        return sum;
    }  
}
