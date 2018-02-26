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
public class Variables {
    public static void main(String[] args) {
    // declare variables and give them a type (they are all int type)
    int yearsEleSchl;
    int yearsMS;
    int yearsHS;
    int yearsCollege;
    int totalYears;
    
    // now initialize them with a value
    yearsEleSchl = 5;
    yearsMS = 3;
    yearsHS = 4;
    yearsCollege = 2;
    totalYears =  yearsEleSchl + yearsMS + yearsHS + yearsCollege;
    
    // and print the value of totalYears to the console with some text
    System.out.println("Total years in school: " + totalYears);
} // close main method
   
}// close class Variables