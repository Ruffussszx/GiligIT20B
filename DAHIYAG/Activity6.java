/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dahiyag;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           
        int age = 0;
        
        System.out.println("enter age:");
        age = scan.nextInt();
        if (age >= 0 && age <= 17){
            System.out.println("go home and sleep");
        }
        else if (age >= 18 && age <= 59){
                System.out.println("lets party");
        }
        else if (age >= 18 && age <= 59){
                System.out.println("go drink coffee somewhere");
        }
        else{
            System.out.println("Invalid age!");
          
                
                    
                    }    
        }
        
    }
            
    

