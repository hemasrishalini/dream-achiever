/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
import java.util.*;

public class DeleteElementArray {
    public static void main(String[] args){
        element();  
    }
    public static void element(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(2);
        numbers.add(9);
        numbers.add(4);
        
        numbers.remove(0);
        System.out.println(numbers);
    }
}
