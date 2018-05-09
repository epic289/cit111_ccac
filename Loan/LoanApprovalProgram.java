/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;
import java.util.Scanner;
import Loan.Application;
/**
 *
 * @author lfitz
 */
public class LoanApprovalProgram {
    public static void main(String[] args) {
        
        Application.setFirstNameOfApplicant(getUserStringInput("What is your first name?"));
        Application.setLastName(getUserStringInput("What's your last name?"));
        Application.userAge(getUserIntInput("How old are you?"));
        Application.userGender(getUserStringInput("Are you male or female?"));
        Application.birthYear(getUserIntInput("What year were you born?"));
        Application.creditScore(getUserIntInput("What is your credit score?"));
        Application.loanRequest(getUserDoubleInput("How much are you requesting to borrow?\n our minimum to apply for is $1000."));
        Application.employmentStatus(getUserStringInput("Where do you currently work?"));
        Application.yearsEmployed(getUserIntInput("How many years have you worked there?"));
        Application.monthsEmployed(getUserIntInput("How many months have you worked there?"));
        Application.income(getUserDoubleInput("What is your monthly income?"));
        Application.debt(getUserDoubleInput("How much do you pay in monthly expense.\n i.e. bills, school loans, daily life."));
        Application.dependents(getUserIntInput("How many dependents do you have?"));
        Application.jobsWorked(getUserIntInput("How many jobs have you had within three years?"));
        Application.loanLength(getUserDoubleInput("How many months will you need to pay for this loan? We offer up to 72 months."));
        LoanAgent.reviewApp();
        LoanCriteria.getFinalAnswer();
        
    }// close main
    
    public static String getUserStringInput(String prompt){
        String input;
        Scanner inputScanner = new Scanner (System.in);
        System.out.println(prompt);
        input = inputScanner.nextLine();
        return input;
    } // close get userStringInput
    
    public static double getUserDoubleInput(String prompt){
        double input;
        Scanner inputScanner = new Scanner (System.in);
        System.out.println(prompt);
        input = inputScanner.nextDouble();
        return input;
    }// close getUserDoubleInput
    
    public static int getUserIntInput(String prompt){
        int input;
        Scanner inputScanner = new Scanner (System.in);
        System.out.println(prompt);
        input = inputScanner.nextInt();
        return input;
    }// close getUserIntInput
    
    
    
    
    
 
    
}// close class
