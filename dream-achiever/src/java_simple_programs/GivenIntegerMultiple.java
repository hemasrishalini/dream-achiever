/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to check whether the given integer is a multiple of 5


public class GivenIntegerMultiple {
    public static void main(String[] args){
        multiple(57);
    }
    public static void multiple(int num){
        int reminder = num%5;
        if(reminder==0){
            System.out.println("given integer is multiple of 5");
        }else{
            System.out.println("given integer is not multiple of 5");
        }
    }
}
