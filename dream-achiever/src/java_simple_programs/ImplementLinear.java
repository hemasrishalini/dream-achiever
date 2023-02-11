/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to implement linear search


public class ImplementLinear {
    public static void main(String[] args){
        int[] nums = new int[]{2,3,3,4};
        linear(nums,3);
    }
    public static void linear(int[] nums, int target){
        boolean found = false;
        for(int i = 0; i <nums.length; i++){
            if(target==nums[i]){
                System.out.println("sucessful search "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not search sucessful");
        }
    }
}
