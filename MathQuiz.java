/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_while;
import java.util.Scanner;
/**
 *
 * @author lfitz
 */
public class MathQuiz {
    public static void main(String [] args){
        
        //I set a string for my explaination because I am using it multiple 
        //times.
        String explain = "5 + 2 = 7. 7 + 3 = 10!";
        
        // set final ints for the answer, problem, and attempts because they
        // will not change.
        final int MATH_ANSWER = 10;
        final int MATH_PROBLEM = 5+2+3;
        final int ATTEMPTS = 3;
        
        // set ints that will change
        int Answer; 
        int attempt = 0;
        
        
        
        
        // labeled my scannner
        Scanner quizScanner = new Scanner(System.in);
        
        // began while to contain number of attempts, correct answers, and
        // explanations as to why your answer is wrong.
        while(attempt <= ATTEMPTS){
            // prompting user to answer problem.
            System.out.println("What is 5 + 2 + 3? ");
            System.out.println("You have a total of " + (ATTEMPTS - attempt) + 
                    " attempts left");
            Answer = quizScanner.nextInt();
            // this is my attempt counter so my while knows when to stop
            attempt = attempt + 1;
            // this is my if that will congratulate you if you get the correct
            // answer.
            if(Answer == MATH_ANSWER){
            System.out.println("Great job! You're a smarty pants!");
            // my print line is able to just use my set string
                System.out.println(explain);
                // break was to ensure the while loop stopped
            break;            
            // this else if to explain why the answer is wrong by it being too 
            // low
            } else if(Answer < MATH_ANSWER){
                System.out.println("Oops! Try again!");
                System.out.println("Your answer is too low! ");
                
                System.out.println("You have " + attempt + " attempt(s) used.");
             // this else if is to explain why the answer is wrong    
            } else if(Answer > MATH_ANSWER){
                System.out.println("Oops! Try again!");
                System.out.println("Your answer is too high!");
                
                System.out.println("You have " + attempt + " attempt(s) used.");
            }if(attempt >= ATTEMPTS){
            System.out.println("You have failed too many attempts");
            System.out.println("Here's the proper explanation." 
                    + explain);
            // break so that the while stops once too many attampts are made.
            break;
            
            }// close if else 
        }// close while
    }// close main
}// close class
            
        
                    
            
                    
            
                    
            
            
        
    
        
        
        
        
                
    
   
    

