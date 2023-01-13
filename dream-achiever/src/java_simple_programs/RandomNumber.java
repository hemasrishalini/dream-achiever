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


public class RandomNumber {
    public static void main(String[] args){
       randomNumber();
    }
    public static void randomNumber(){
        int min = 1;
        int max = 100;
        Random r = new Random();
        int rn = r.nextInt(min,max);
        System.out.println(rn);
        if(rn%2==0){
           System.out.println( "random number is even");
        }else{
           System.out.println( "random number is odd"); 
        }
    }
    
}
