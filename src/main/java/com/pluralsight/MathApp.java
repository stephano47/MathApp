package com.pluralsight;

public class MathApp {
    public static void main(String [] args) {

// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
        // Question 1:
    double bobSalary = 20000.85;
    double garySalary = 38760.72;
    double highestSalary = Math.max(bobSalary, garySalary);
    System.out.println("The highest salary is " + (highestSalary));

       //Question2
    double carPrice = 20211.25;
    double truckPrice = 55060.98;
    double cheapestPurchase = Math.min(carPrice, truckPrice);
    System.out.println("The cheapest purchase is " + (cheapestPurchase));

      //Question3
    double radius = 7.25;
    Math.pow(radius, ^2);

    }
}
