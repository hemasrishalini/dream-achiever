/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to find the average of 5 numbers using a while loop


public class AverageOfFiveNumber {
    public static void main(String[] args){
        int[] nums = new int[]{2,3,4,5,6};
        System.out.println(average(nums));
    }
    public static float average(int[] nums){
        float sum = 0;
        int i = 0;
        while(i<nums.length){
            sum =sum + nums[i];
            i++;
        }
        float avg = sum/nums.length;
        return avg;
    }
}
