/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to find out the average of a set of integers


public class AverageOfIntegerArray {
    public static void main (String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(integerArray(nums));
    }
    public static float integerArray(int[] nums){
        float sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        float avg = sum/nums.length;
        return avg;
    }
}
    
     

// sum -1, i=4
// nums 2,-5,1,-3,4
// i    0, 1,2, 3,4
