/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;
import java.util.Scanner;

/**
 *
 * @author lexus.fitzpatrick
 */
public class Application {
    
        public static Scanner inputScanner = new Scanner(System.in);
        public static LoanApplicant user = new LoanApplicant();
    
    public static void setFirstNameOfApplicant(String name){
        user.firstName = name;
        
    }// close firstNameOfApplicant
    
    public static void setLastName(String name){
        user.lastName = name;
    }// close lastName
    
    public static void userAge(int age){
        user.setAge(age);
    }// close userAge
    
    public static void userGender (String m){
        user.gender = m;
    }// close userGender
    
    public static String getGender(){
        return user.gender;
    }// close setGender
    
    public static void employmentStatus(String work){
        user.setEmployment(work);
        
    }// close setEmploymentStatus
    
    
    public static void yearsEmployed(int years){
       user.setYearsEmployed(years);
    }// close setYearsEmployed
    
   
    
    public static void monthsEmployed(int months){
        user.setMonthsEmployed(months);
    }// close setMonthsEmployed
    
    public static void income(double money){
        user.setIncome(money);
    }// close income
    
    public static void creditScore (int score){
        user.setCreditScore(score);
    }// close creditScore
    
    public static void birthYear(int year){
        user.birthday = year;
    }// close birthYear
    
    public static void debt (double debt){
        user.bills = debt;
    }// close debt
    
    public static void dependents (int kid){
        user.dependents = kid;
    }// close dependents
    
    public static void jobsWorked (int job){
        user.jobs = job;
    }// close jobsWorked
    
    public static void loanRequest(double loan){
        user.request = loan;
    }// close loanRequest
    
    public static void loanLength (double length){
        user.loanLength = length;
    }// close 
}// close class
