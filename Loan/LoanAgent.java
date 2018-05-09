/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

/**
 *
 * @author lfitz
 */
public class LoanAgent {
    
    
    public static void reviewApp(){
        System.out.println("Hello " + LoanApplicant.firstName + ", I am your loan agent. Let's review your application.");
        System.out.println("Let's begin talking about who you are.");
        System.out.println("Okay your name is " + LoanApplicant.firstName + " "+ LoanApplicant.lastName);
        System.out.println("You are requesting $" + LoanApplicant.request);
        System.out.println("You are " + (LoanApplicant.getAge())+ " years old.");
        System.out.println("You are also a " + Application.getGender());
        System.out.println("born in the year of " +(LoanApplicant.birthday)+ ".");
        System.out.println("Your current credit score is  " + LoanApplicant.getCreditScore()+ ".");
        System.out.println("Now to talk about your employment.");
        System.out.println("You currently work at " + LoanApplicant.getEmployment());
        System.out.println("you have been there for " + LoanApplicant.getYearsEmployed() + " years " + LoanApplicant.getMonthsEmployed() + " months.");
        System.out.println("Making roughly " + LoanApplicant.getIncome() + " a month.");
        System.out.println("Your employment states you worked at a total of " + LoanApplicant.jobs + " places.");
        System.out.println("Now your bills are $ " + LoanApplicant.bills + " a month.");
        System.out.println(" with a total of " + LoanApplicant.dependents + " dependents.");
        System.out.println("This is all of the information I have gathered. Time to see if you are approved.");
        
        
    }// close reviewApp
    
}// close loanAgent
