/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
import java.util.Scanner;

public class ImplementBasicOperation {
    public static void main(String[] args){
        basicOperation();
    }
    public static void basicOperation( ){
        int add , subract ,multiply ;
        double divide;//(double)casting not compulsary here,bocz divide is already double type 
          
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number : ");
        int firstnumber = s.nextInt();
        System.out.println("enter second number : ");
        int secondnumber = s.nextInt();
        
        while(true){
            System.out.println("enter 1 for addition" );
            System.out.println("enter 2 for subraction" );
            System.out.println("enter 3 for multiply" );
            System.out.println("enter 4 for division" );
            System.out.println("enter 5 for exit" );
            int option = s.nextInt();
            switch(option){
                case 1:
                    add = firstnumber+secondnumber;
                    System.out.println("result: "+add);
                    break;
                case 2:
                    subract = firstnumber-secondnumber; 
                    System.out.println("result: "+subract);
                    break;
                case 3:
                    multiply = firstnumber*secondnumber;
                    System.out.println("result: "+multiply);
                    break;
                case 4:
                    divide = firstnumber/secondnumber;
                    System.out.println("result: "+divide);
                    break;
                case 5:
                    System.exit(0);
            }
        }
         
    }
    
}
