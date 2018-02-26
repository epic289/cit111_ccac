/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg3;

import java.util.Scanner;
/**
 *
 * @author lexus.fitzpatrick
 */
public class CheckValue {
    public static void main(String[] args) {
        System.out.println("How tall are you?");
        
        Scanner keyScanner = new Scanner (System.in);
        int height = keyScanner.nextInt();
        if(height > 6){
            System.out.println("You're tall");
        
    } else {
            System.out.println("You are short");
        }
    }
    
}
