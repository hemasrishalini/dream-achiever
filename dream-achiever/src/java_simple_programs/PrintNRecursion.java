/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class PrintNRecursion {
    public static void main(String[] args) {
        recursion(10);
      }

    public static void recursion(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        recursion(num-1);
        System.out.println(num);
        
    }
}
