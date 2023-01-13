/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class ImplementLinear {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        linearSearch(nums,7);
    }
    public static void linearSearch(int[] nums,int target){
        boolean found = false;
        for(int i =0; i<nums.length; i++){
            if(target==nums[i]){
                System.out.println("successful search the element is found at position is:" +i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not successful search");
        }
    }
    
}
