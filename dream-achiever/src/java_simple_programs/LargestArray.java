/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to find the largest number in an array without using built-in functions


public class LargestArray {
    public static void main(String[] args){
        int[] nums = {2,3,1,3};
        largestNumber(nums);
    }
    public static int largestNumber(int[] nums){
        int pos = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[pos]){
                pos = i;     
            }
        }
       System.out.println("the largest element is "+nums[pos]+" position is :" +pos); 
       return pos;
    }
}
