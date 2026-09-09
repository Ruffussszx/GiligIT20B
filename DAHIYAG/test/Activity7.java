/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Activity7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letter = 'r';
        
         
        System.out.println("enter letter: ");
        letter = scan.next().charAt(0);
        switch (letter){
            case 'a','A','e','E','i','I','o','O','u','U':
                System.out.println("The letter" + letter + "is a consonant." );
        }
        
        
       
        
        
                
        
        
    }
    
}
