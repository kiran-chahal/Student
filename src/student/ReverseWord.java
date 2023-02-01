/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
//added comment here for fetch+merge
/**
 *
 * @author kchahall
 */
import java.util.*;
import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //hi kiran
        System.out.println("enter a word: ");
        String word = input.nextLine();
        
        char[] word0 = new char[word.length()];
        
        System.out.println();
        
        for(int i = 0; i<word.length(); i++){
            word0[i] = word.charAt(i);
            System.out.println(word0[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i<word.length(); i++){
            word0[i] = word.charAt(word.length()-1-i);
            System.out.println(word0[i]);
        }
    }   
}
