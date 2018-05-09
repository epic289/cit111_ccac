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
public class LoanCriteria {
    static double yearlyIncome = (LoanApplicant.getIncome() * 12);
    static double debt = (LoanApplicant.bills * 12);
    static double minIncome = 20000;
    static String answer;
    static int minYearsEmployed = 1;
    static int employed = (LoanApplicant.getYearsEmployed());
    static double ratio = (yearlyIncome - debt);
    static double totalRequest = (LoanApplicant.request);
    static double payments;
    static double months = (LoanApplicant.loanLength);
    static boolean criteria = true;
    static String finalAnswer;
    
    public static void firstLoanQualification(){
        if(yearlyIncome > minIncome){
        secondLoanQualification();
       
        }else{
            denied();
            
        }// close if/else
    
    }// close firstLoanQualification
    
    public static void secondLoanQualification(){
        if (minYearsEmployed < employed){
            thirdLoanQualification();
            
        }else{
            denied();
        }// close if else
        
    }// close secondLoanQualification
    
    public static void thirdLoanQualification (){
        if((ratio * .3) > (totalRequest *.3)){
            System.out.println("You were approved!");
            System.out.println("Your payments will be $" + paymentsWillBe() + " a month.");
            System.exit(0);  
        }else{
            denied();
        }// close if else
    }// close thirdLoanQualification
    
//    pub
    
    public static void denied (){
        System.out.println("Sorry, you did not meet the requirements.");
        System.exit(0);
    }// close denied
    
    public static double paymentsWillBe(){

     
        return totalRequest/months;
    }// close paymentsWillBe
    
    public static void getFinalAnswer (){
        firstLoanQualification();
    }// close finalAnswer
    
}// close loanCriteria
