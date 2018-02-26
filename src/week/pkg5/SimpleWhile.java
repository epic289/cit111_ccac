package week.pkg5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author lexus.fitzpatrick
 */
public class SimpleWhile {
    public static void main (String [] args) {
        int a = 0;
        int numLoops = 0;
  
        System.out.println (" How many times do you want me to loop? ");
        Scanner userInputScanner = new Scanner (System.in); 
        numLoops = userInputScanner.nextInt();
        
        
        while(a < numLoops) {
            System.out.println("a is " + a);
            a = a + 1;
             
            
        }// close while
        System.out.println("I'm looping!!!!! ");
    }//close main
}//close class

