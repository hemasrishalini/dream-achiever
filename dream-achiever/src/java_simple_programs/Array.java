/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
// Filling an Array Using For Loops in Java


public class Array {
    public static void main(String[] args){
       int[] nums = new int[12];
       array(nums);
    }
    public static void array(int[] nums){
       int value = 9;
       for(int i = 0; i<nums.length;i++){
           nums[i]=value;
           value--;
           
       }
       for(int i : nums){
       System.out.println(i);
       }
    }
}
