
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Activity9 {
    //odd positive
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = 1;
        
        
       
        
        while (num!=0 ){
                System.out.print("Enter a number: ");
                 num = scan.nextInt();
            if(num ==0){
                System.out.print("Goodbye Philippines!");
                break;
                
            }
        if (num <= 0){
            System.out.println("The number " + num+ " is Negative ");
        }else
            System.out.println("The number " + num+ " is positive ");
            
        if(num % 2 == 0){
            System.out.println("The number is " +  num + " is Even" );
        }else {
            System.out.println("The number is " +  num + " is Odd" );
            
            }
        }
    }
}
    

        
    
            
        
