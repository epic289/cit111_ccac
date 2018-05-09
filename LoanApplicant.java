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
public class LoanApplicant {
   static String gender;
    static String firstName;
    static String lastName;
//    String nameOfDep;
    static double request;
    static double bills;
    static int jobs;
    static int dependents;
    static int birthday;
//    int depBirthday;
    private static String employment;
    private static double income;
    private static int years;
    private static int months;
    private static int cscore;
    private static int age;
    static double loanLength;
    
    
    public static String getEmployment(){
        return employment;
    }// close getEmployment
    
    public void setEmployment(String employment){
        this.employment = employment;
    }// close setEmployment
    
    public static double getIncome(){
        return income;
        
    }// close getIncome
    
    public void setIncome (double money){
        this.income = money;
    }// close setIncome
    
    public static int getYearsEmployed (){
        return years;
    }// close getYearsEmployed
    
    public void setYearsEmployed (int years){
        this.years = years;
    }// close setYearsEmployed
    
    public static int getMonthsEmployed (){
        return months;
    }// close getMonthsEmployed
    
    public void setMonthsEmployed(int months){
        this.months = months;
    }// close setMonthsEmployed
    
    
    public static int getAge(){
        return age;
    }// close getAge
    
    public void setAge(int age){
        this.age = age;
    }// close setAge
    
    public static int getCreditScore(){
        return cscore;
    }// close getCreditScore
    
    public void setCreditScore(int score){
        this.cscore = score;
    }// close setCreditScore
    

}// close class
