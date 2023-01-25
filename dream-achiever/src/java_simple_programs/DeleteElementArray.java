/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to delete an element from an array by index


import java.util.*;

public class DeleteElementArray {
    public static void main(String[] args){
        elementArray();
    }
    public static void elementArray(){
        ArrayList<Integer> number = new ArrayList<Integer>(2);
        number.add(6);
        number.add(5);
        
        number.remove(1);
        System.out.println(number);
    }
}
