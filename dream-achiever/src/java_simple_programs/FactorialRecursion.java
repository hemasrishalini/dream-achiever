/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to find the factorial of a number using recursion
public class FactorialRecursion{
    public static void main (String[] args){
        int x = factorial(4);
        System.out.println(x);
    }
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        f = factorial(num-1);
        return f;
    }
}



/*public class FactorialRecursion {
     public static void main(String[] args){
        System.out.println("end");
        int x =factorial(3);
        System.out.println(x);
        System.out.println("start");
         
     }
     public static int factorial(int num){
        System.out.println(num+"z");
        if(num==1){
            System.out.println("one");
            return 1;
        }
        System.out.println(num+"y");
        int f=factorial(num-1);
        System.out.println(num+"x");
        f=factorial(num-1);
        System.out.println(num+"w");
        return num*f;
     }
    
}
