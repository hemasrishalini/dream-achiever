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
       int[] nums = new int[10];
       array(nums);
    }
    public static void array(int[] nums){
        int value = 9;
        for(int i = 0; i<nums.length;i++){
           nums[i]=value;
           value--;
           
        }
        for(int n : nums){
            System.out.println(n);
        }
    }
}
//nums  9,8,7,6,5,4,3,2,1,0
//index 0,1,2,3,4,5,6,7,8,9