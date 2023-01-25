/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
import java.util.Random;

public class LargestAndSmallestRandomNumber {
    public static void main (String[] args){
        int min = 1000, max = 100;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.println(largest);
        System.out.println(smallest);
        int n = 2;
        largestSmallestNumber(n,min,max,largest,smallest);
    }
    public static void largestSmallestNumber(int n,int min,int max,int largest,int smallest){
        int i = 0;
        while(i<=n){
            Random r = new Random();
            int randomnumber = min+r.nextInt(max);
            System.out.println("generate random nymber is :" + randomnumber);
            if(randomnumber>largest){
                largest = randomnumber; 
            }
            if(randomnumber<smallest){
                smallest = randomnumber;
            }
            i++;
        }
        System.out.println("\n");
        System.out.println("The smallest number is: "+smallest);
        System.out.println("The largest number is: "+largest);
    }
    
}
