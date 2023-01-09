/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class OddNumberArray {
    public static void main(String[] args){
       int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
       odd(nums);
    }
    public static void odd(int[] nums){
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                count++;
            }
        }
        System.out.println("list of odd number is:" +count);
    }
    
}
//