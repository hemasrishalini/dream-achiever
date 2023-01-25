/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to check whether the given integer is a multiple of both 5 and 7


public class GivenIntegerMultipleFiveSeven {
    public static void main(String[] args){
        fiveSeven(35); 
    }
    public static void fiveSeven(int num){
        int reminder = num%5;
        int reminder2 = num%7;
        if((reminder==0)&&(reminder==0)){
            System.out.println("given integer is multiple of 5 and 7");
        }else{
            System.out.println("given integer is not multiple og 5 and 7");
        }
    }
}
