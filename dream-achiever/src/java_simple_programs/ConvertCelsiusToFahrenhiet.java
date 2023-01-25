/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */

//Java program to convert the temperature in Centigrade to Fahrenheit

public class ConvertCelsiusToFahrenhiet {
    public static void main(String[] args){
        ConvertCelsiusToFahrenhiet obj = new ConvertCelsiusToFahrenhiet();
        System.out.println(obj.c2f(5));
    }
    public static float c2f(float celsius){
        float f = (celsius*9/5)+32;
        return f;
    }
}