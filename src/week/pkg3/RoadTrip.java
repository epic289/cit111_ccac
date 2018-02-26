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
public class RoadTrip {
    public static void main(String[] args){
        
        final double BABY_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
    
        //declaring and intializing variables
        String carMake = "2010 Kia Optima";
        String carName = "Baby";
        int maxPassengers = 5; //primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToNewYork = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring this varibale but not initializing
        
        //simulation of the roadtrip
        System.out.println("***Road trip simulator***");
        System.out.println("--> Beginning of trip state <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance To Destination: " + distanceToNewYork);
        System.out.println("Full Car? " + carFull +  "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("String trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("*********************************************");
        
        // Calculate leg distance: 25% of total trip, strong in legDistance
        double  decimalOfOneQuarter = .25;
        legDistance = distanceToNewYork * decimalOfOneQuarter;
        System.out.println("Beginning leg 1: ");
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtractleg distance from distanceTo destination,over-write distance
        distanceToNewYork = distanceToNewYork - legDistance;
        
        // "see" hithc hiker heading West
        System.out.println("Oh, look! A person who wants to go north, too!");
        
        // Check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            
        }
        
        // calculate prince of gas for first leg and store in temp variable
        // gas price+ (distance / milePerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / BABY_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        // deduct $ spent on gas from oney remaining and over-write tripBudget
        tripBudget = tripBudget - gasPriceForLeg;
        
        // reprint staus of variables to the console
        System.out.println("****Variable stats at end of the leg 1****");
        System.out.println("Distance To Destination: " + distanceToNewYork);
        System.out.println("Full Car? " + carFull +  "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " Passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
    }// close class main
} //close class Roadtrip
