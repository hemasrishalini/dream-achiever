/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java Program to Find Your Weight on Mars

public class WeightOfMars {
    public static void main(String[] args){
        mars(6.32);
    }
    public static void mars(double weight){
        double weightonmars = (weight*.38);
        System.out.println("weight of mars is:" + weightonmars);
        int weightonmarsInt = (int)weightonmars;
        System.out.println("weight of mars is:" + weightonmarsInt);
        char weightonmarsChar =(char)weightonmars;
        System.out.println("weight of mars is:" + weightonmarsChar);
    }
}
