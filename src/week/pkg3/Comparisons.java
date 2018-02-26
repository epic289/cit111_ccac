/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg3;

/**
 *
 * @author lexus.fitzpatrick
 */
public class Comparisons {
    
    public static void main(String[] args) {
        int correctPasscode = 5934;
        int attemptedPasscode = 1234;
        
        //try comparing age to retirement age with the greater or equal to <=
        // println will display the result of this comparison
   
        
        // use an if-statement to check if age is greater or equal to retirementAge
        if(correctPasscode == attemptedPasscode){
            //everything inside theses {} gets executed if the value in the
            // if's parenthesis ( ) comes out to true
            System.out.println("Codes Match! You're in! " );
        } else {
        // and everything in the else { } block is executred if the value
        // in the if's ( ) parenthesis ( ) come out to false
        System.out.println("Codes don't match--No soup for you! ");
        }// close if/else
    }// close main method
}// close class Comparisons 

    
