/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
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
        for(int r=0; r<n.length; r++){
            System.out.println(n[r]);
            sum = sum+n[r];
        }
        
        System.out.println(sum);
        return sum;
    }  
}
