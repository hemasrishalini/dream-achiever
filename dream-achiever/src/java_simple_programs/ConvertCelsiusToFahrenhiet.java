/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class ConvertCelsiusToFahrenhiet {
    public static void main(String[] args){ 
        ConvertCelsiusToFahrenhiet obj = new ConvertCelsiusToFahrenhiet();
        System.out.println(obj.c2f(0));
        System.out.println(obj.c2f(50));
        System.out.println(obj.c2f(37));
        System.out.println(obj.c2f(100));
    }
    
    public float c2f(float celsius){ 
        float f = (celsius*9/5)+32; 
        return f;
    }       
}
