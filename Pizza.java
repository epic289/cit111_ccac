/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_scope;

import java.util.Scanner;
import java.lang.InterruptedException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 *
 * @author lexus.fitzpatrick
 */

// I set local variables so each method can access them. 
public class Pizza {
    static Scanner order = new Scanner(System.in);
    static int foodOrdered = 0;
    static NumberFormat total = new DecimalFormat("#0.00");
    static double grandTotal = 0;
    static int pasta = 0;
    static int pizza = 0;
    static int hoagie = 0;
    static int drinks = 0;
    static int desserts = 0;
    
    
    // I made my main simple, allowing additions if needed. Main is the first method 
    // that is ran, so it's best to keep less in it. 
    
    public static void main(String[] args)throws InterruptedException{
        System.out.println("Hello welcome to Lexii's pizza palace.");
        Thread.sleep(1000);
        //thread.sleep gives my method a second to prompt the next output. 
        //due to the desire of wanting my items timed, I had to also incorporate
        // throwing interruptedExceptions. They do not have anything to catch,
        // but this is a bit further than our lessons currently, so I don't want
        // to overwhelm anyone. Each method has to have "throws interruptedException"
        // so that they can hold the method call promptmenu.
        promptMenu();
    }// close main
    
    public static void promptMenu() throws InterruptedException{
        System.out.println("What would you like to order?");
        System.out.println("Enter the number beside of the item you would like to order.");
        Thread.sleep(2000);
        // a thread.sleep reads milliseconds, hence why the numbers are thousands.
        System.out.println("1 = Pasta");
        System.out.println("2 = Pizza");
        System.out.println("3 = Hoagie");
        System.out.println("4 = Drinks");
        System.out.println("5 = Dessert");
        int choice;
        choice = order.nextInt();

        switch(choice){
            case 1: 
                pastaOrdered(order);
                break;
            case 2:
                pizzaOrdered(order);
                break;
            case 3:
                hoagieOrdered(order);
                break;
            case 4:
                drinksOrdered(order);
                break;
            case 5:
                dessertOrdered(order);
                break;
            default:
                System.out.println("Sorry, that is an invalid input. Now going back to menu.");
                promptMenu();
                break;
        }// close switch
    }// close promptMenu
        
        // for each food category I made seperate methods, one to order the food
        // and another to calculate the food. I made member variables to help 
        // make the calculations easier for the given methods. Each 
        // calculation method has the parameters of needing a string which is
        // the name of the food and an int which is the price of the food.
    
    
    public static void pastaOrdered(Scanner food) throws InterruptedException {
        
        double rigatoni = 7.99;
        
        double linguini = 6.99;
        double fettucini = 10.00;
        int choice;
        
        System.out.println("Which pasta would you like? We offer: ");
        System.out.println("1 = Rigatoni - $7.99");
        System.out.println("2 = Linguini - $6.99");
        System.out.println("3 = Fettucini Alfredo - $10.00");
        System.out.println("4 = Back to menu selection.");
        choice = food.nextInt();

            switch(choice){
                case 1:
                    orderPasta("rigatoni" , rigatoni);
                    break;
                case 2: 
                    orderPasta("linguini" , linguini);
                    break;
                case 3:
                    orderPasta("Fettucini alfredo" , fettucini);
                    break;
                case 4:
                    promptMenu();
                    break;
                default:
                    System.out.println("Sorry, that is an invalid input. Now going back to menu.");
                    promptMenu();
                    break;
        }// switch
    }// close pasta ordered
                
    public static void pizzaOrdered(Scanner food) throws InterruptedException {
        double pepperoni = 8.99;
        double plain = 7.99;
        double sausage = 8.99;
        int choice;
        
        System.out.println("Which pizza would you like? We offer: ");
        System.out.println("1 = Plain - $7.99");
        System.out.println("2 = Pepperoni - $8.99");
        System.out.println("3 = Sausage - $8.99");
        System.out.println("4 = Back to menu selection.");
        choice = food.nextInt();

            switch(choice){
                case 1:
                    orderPizza("plain" , plain);
                    break;
                case 2: 
                    orderPizza("pepperoni" , pepperoni);
                    break;
                case 3:
                    orderPizza("sausage" , sausage);
                    break;
                case 4:
                    promptMenu();
                    break;
                default:
                    System.out.println("Sorry, that is an invalid input. Now going back to menu.");
                    promptMenu();
                    break;
        }// switch
    }// close pizzaOrdered
                
    public static void hoagieOrdered(Scanner food) throws InterruptedException {
        double ham = 7.99;
        double steak = 9.99;
        double meatball = 8.99;
        
         int choice;
        
        System.out.println("Which hoagie would you like? We offer: ");
        System.out.println("1 = Ham - $7.99");
        System.out.println("2 = Steak - $8.99");
        System.out.println("3 = Meatball - $8.99");
        System.out.println("4 = Back to menu selection.");
        choice = food.nextInt();
        
            switch(choice){
                case 1:
                    orderHoagie("ham" , ham);
                    break;
                case 2: 
                    orderHoagie("steak" , steak);
                    break;
                case 3:
                    orderHoagie("meatball", meatball);
                    break;
                case 4:
                    promptMenu();
                    break;
                default:
                    System.out.println("Sorry, that is an invalid input. Now going back to menu.");
                    promptMenu();
                    break;
        }// switch
    }// close hoagieOrdered
                
    public static void drinksOrdered(Scanner food)throws InterruptedException{
        double soda = 2.99;
        double water = 1.99;
        double tea = 2.99;
        
         int choice;
        
        System.out.println("Which drink would you like? We offer: ");
        System.out.println("1 = Soda - $2.99");
        System.out.println("2 = Water - $1.99");
        System.out.println("3 = Tea - $2.99");
        System.out.println("4 = Back to menu selection.");
        choice = food.nextInt();

            switch(choice){
                case 1:
                    orderDrink("soda" , soda);
                    break;
                case 2: 
                    orderDrink("water", water);
                    break;
                case 3:
                    orderDrink("tea", tea);
                    break;
                case 4:
                    promptMenu();
                    break;
                default:
                    System.out.println("Sorry, that is an invalid input. Now going back to menu.");
                    promptMenu();
                    break;
        }// switch
    }// close drinksOrdered
                
    public static void dessertOrdered(Scanner food)throws InterruptedException{
        double brownie = 4.99;
        double cheesecake = 4.99;
        double cinnasticks = 5.99;
        
        int choice;
        
        System.out.println("Which dessert would you like? We offer: ");
        System.out.println("1 = Brownie - $4.99");
        System.out.println("2 = Cheesecake - $4.99");
        System.out.println("3 = CinnaSticks - $5.99");
        System.out.println("4 = Back to menu selection.");
        choice = food.nextInt();

            switch(choice){
                case 1:
                    orderDessert("brownie",brownie);
                    break;
                case 2: 
                    orderDessert("cheesecake", cheesecake);
                    break;
                case 3:
                    orderDessert("cinnasticks", cinnasticks);
                    break;
                case 4:
                    promptMenu();
                    break;
                default:
                    System.out.println("Sorry, that is an invalid input. Now going back to menu.");
                    promptMenu();
                    break;
        }// switch
    }// close dessert ordered
    public static void orderPasta(String nameOfPasta, double price)throws InterruptedException{
                 int choice;
         System.out.println("You have selected a " + nameOfPasta);
                    System.out.println("How many would you like?");
                    choice = order.nextInt();
                    System.out.println("You have ordered " + choice + " " + nameOfPasta );
                    grandTotal = (choice * price) + grandTotal;
                    System.out.println("Would you like to add more to your order?");
                    pasta = choice + pasta;
                    confirmDeny();
                    if(order.nextInt() == 1) {
                        promptMenu();
                    }else{
                        System.out.println("Total: " + grandTotal);
                        orderTotal();    
                    }// close else if
    }// close orderPasta
    
    public static void orderPizza(String nameOfPizza, double price)throws InterruptedException{
        int choice;
         System.out.println("You have selected a " + nameOfPizza);
                    System.out.println("How many would you like?");
                    choice = order.nextInt();
                    System.out.println("You have ordered " + choice + " " + nameOfPizza);
                    grandTotal = (choice * price) + grandTotal;
                    System.out.println("Would you like to add more to your order?");
                    pizza = choice + pizza;
                    confirmDeny();
                    if(order.nextInt() == 1) {
                        promptMenu();
                    }else{
                        System.out.println("Total: " + grandTotal);
                        orderTotal();    
                    }// close else if
        
    }// close orderPizza
    
    public static void orderHoagie(String nameOfHoagie, double price)throws InterruptedException{
        int choice;
         System.out.println("You have selected a " + nameOfHoagie);
                    System.out.println("How many would you like?");
                    choice = order.nextInt();
                    System.out.println("You have ordered " + choice + " " + nameOfHoagie);
                    grandTotal = (choice * price) + grandTotal;
                    System.out.println("Would you like to add more to your order?");
                    hoagie = choice + hoagie;
                    confirmDeny();
                    if(order.nextInt() == 1) {
                        promptMenu();
                    }else{
                        System.out.println("Total: " + grandTotal);
                        orderTotal();    
                    }// close else if
        
    }// close orderHoagie
    
    public static void orderDrink(String nameOfDrink, double price)throws InterruptedException{
        int choice;
         System.out.println("You have selected a " + nameOfDrink);
                    System.out.println("How many would you like?");
                    choice = order.nextInt();
                    System.out.println("You have ordered " + choice + " " + nameOfDrink);
                    grandTotal = (choice * price) + grandTotal;
                    System.out.println("Would you like to add more to your order?");
                    drinks = choice + drinks;
                    confirmDeny();
                    if(order.nextInt() == 1) {
                        promptMenu();
                    }else{
                        System.out.println("Total: " + grandTotal);
                        orderTotal();    
                    }// close else if
    }// close orderDrink
    
    public static void orderDessert(String nameOfDessert, double price)throws InterruptedException{
         int choice;
         System.out.println("You have selected a " + nameOfDessert);
                    System.out.println("How many would you like?");
                    choice = order.nextInt();
                    System.out.println("You have ordered " + choice + " " + nameOfDessert);
                    grandTotal = (choice * price) + grandTotal;
                    System.out.println("Would you like to add more to your order?");
                    desserts = choice + desserts;
                    confirmDeny();
                    if(order.nextInt() == 1) {
                        promptMenu();
                    }else{
                        System.out.println("Total: " + grandTotal);
                        orderTotal();    
                    }// close else if
    }// close orderDessert
    public static void confirmDeny (){
        // this method was made, so I did not have to type the same string over 
        // and over again.
        System.out.println("1 = yes. 2 = no.");
    }// close confirmDeny
    
    public static void itemsOrdered(int item, String food){
        System.out.println("You have ordered: " + item + food);
    }// close itemsOrdered
        
    public static void orderTotal() throws InterruptedException{
        System.out.println("Your order total: " + grandTotal);
        System.out.println("You have ordered all of the following.");
        
        itemsOrdered(pasta," pastas." );
        itemsOrdered(pizza, " pizzas.");
        itemsOrdered(hoagie, " hoagies.");
        itemsOrdered(drinks, " drinks.");
        itemsOrdered(desserts, " desserts.");
        System.out.println("Would you like to confirm your order?");
        confirmDeny();
        System.out.println("Pressing 2 will erase your order. You will have to"
                + " create a new one.");
        if(order.nextInt () == 1){
            orderComplete();
        }else{
            pasta = 0;
            pizza = 0;
            hoagie = 0;
            drinks = 0;
            desserts = 0;
            grandTotal = 0;
            
            promptMenu();
        }// close else/if
    }// close orderTotal
    public static void orderComplete(){
        System.out.println("Your total: " + grandTotal);
        System.out.println("Thank you for you order. Your food will be out shortly!");
    }// close orderComplete.
}// close class 
        
            
        
        
        
    
    

