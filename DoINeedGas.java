/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author lexus.fitzpatrick
 */
public class DoINeedGas {
 public static void main(String [] args){
     // set final int to 28
     final int MPG = 28;
     // set variables
     double remaining;
     double miles;
     
     // creat scanner 
     Scanner userInputScanner = new Scanner(System.in);
     //prompt user for gallons of gas remaining
     System.out.println("How many gallons of gas remain in your tank? ");
     remaining = userInputScanner.nextDouble();
     //promt user for miles left
     System.out.println("How many miles to the next service station? ");
     miles = userInputScanner.nextDouble ();
     // set if/ else statement
     if(MPG*remaining >= miles){
         System.out.println("You have enough gas to make it there. ");
         
     }else{
         System.out.println("YOU'RE STUCK!");
     }// close if/else
 
         
   
     
 }// close main   
}// close class
