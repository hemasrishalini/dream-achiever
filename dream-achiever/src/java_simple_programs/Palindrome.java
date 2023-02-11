/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
 

public class Palindrome {
    public static void main(String[] args){
       palindrome("orange"); 
    }
    
    public static boolean palindrome(String word){//Pop  
        boolean palindrome = false;               //poP
        int length = word.length();
        String rev = "";
        for(int i = length - 1; i>=0 ; i--){
            rev = rev + word.charAt(i);
        }
        
        if(word.equalsIgnoreCase(rev)){//checks if two words are equal ingoring caSE EG:Pop ,poP
            
            System.out.println("this is palindrome");
            return true;
        }else{
            System.out.println("this is not palindrome");
            return false;
        }
        
    }
}
    /*public static void main(String[] args){
        //String word = "pop";
        
        //Scanner s = new Scanner(System.in);
        //System.out.println("enter the palindrome word here");
        //a = s.nextLine();
        
       // int n = a.length();
        int i = n-1;
        while(i>=0){
        //for(int i = n - 1; i >= 0; i--){
           //b = b+a.charAt(i);
            i--;
        }
        //if(a.equalsIgnoreCase(b)){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
    }
    
}
