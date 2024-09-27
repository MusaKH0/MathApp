package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        /*--------------------------------------------------------------------------------
        1. Create two variables to represent the salary for Bob and Gary, name them
            bobSalary and garySalary. Create a new variable named
            highestSalary. Determine whose salary is greater using Math.max() and
            store the answer in highestSalary. Set the initial salary variables to any value
            you want. Print the answer (i.e "The highest salary is …")
            ------------------------------------------------------------------------------*/
        // declare variables here
        long bobSalary = 50_000;
        long garySalary = 75_000;

        // then code solution
        long highestSalary = Math.max(bobSalary, garySalary);

        // then use System.out.println() to display results
        System.out.println("The highest salary is ---> " + highestSalary);


        /*------------------------------------------------------------------------------
        2. Find and display the smallest of two variables named carPrice and
           truckPrice. Set the variables to any value you want.
        * -----------------------------------------------------------------------------*/
        // declare variables here
        int carPrice = 25_000;
        int truckPrice = 100_000;

        // then code solution
        long lowestPrice = Math.min(carPrice, truckPrice);

        // then use System.out.println() to display results
        System.out.println("The lowest price is ---> " + lowestPrice);


        /*------------------------------------------------------------------------------
        3. Find and display the area of a circle whose radius is 7.25
        * -----------------------------------------------------------------------------*/
        // declare variables here
        double radius = 7.25;

        // then code solution
        double area = Math.PI * Math.pow(radius, 2);

        // then use System.out.println() to display results
        System.out.println("The area of the circle with radius ||" + radius + "|| is ---> " + area);


        /*------------------------------------------------------------------------------
        4. Find and display the square root a variable after it is set to 5.0
        * -----------------------------------------------------------------------------*/
        // declare variables here
        double variableToSquareRoot = 5.0;

        // then code solution
        double squareRootedVariable = Math.sqrt(variableToSquareRoot);

        // then use System.out.println() to display results
        System.out.println("The square root of ||" + variableToSquareRoot + "|| is ---> " + squareRootedVariable);


        /*------------------------------------------------------------------------------
        5. Find and display the distance between the points (5, 10) and (85, 50)
        * -----------------------------------------------------------------------------*/
        // declare variables here
        int x1 = 5, x2 = 10;
        int y1 = 85, y2 = 50;

        // then code solution
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // then use System.out.println() to display results
        System.out.println("the distance between the points (5, 10) and (85, 50) is ---> " + distance);


        /*---------------------------------------------------------------------------------------
        6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        * --------------------------------------------------------------------------------------*/
        // declare variables here
        double negativeValue = -3.8;

        // then code solution
        double absoluteValue = Math.abs(negativeValue);

        // then use System.out.println() to display results
        System.out.println("The absolute value of ||" + negativeValue + "|| is ---> " +absoluteValue);


        /*---------------------------------------------------------------------------------------
        7. Find and display a random number between 0 and 1
        * --------------------------------------------------------------------------------------*/
        // declare variables here
        // __none needed here__
        
        // code solution
        double randomNumber = Math.random();

        // then use System.out.println() to display results
        System.out.println("Here is a random number ---> " + randomNumber);


    }
}
