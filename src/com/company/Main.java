package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Think Java - Exercise 5.6

        //Import Statement.
        Scanner userInput = new Scanner(System.in);

        System.out.println("Formula: ax2 + bx + c = 0 \n");

        System.out.println("Find a solution for: -b ± √(b2 − 4ac)/2a = x \n");

        System.out.println("Insert a value for a,b,c");
        System.out.println("Insert the value for A here:");

        //Program waiting for user input.
        //While will show user an error message in case they don't type a number.
        while (!userInput.hasNextDouble()) {
            String word = userInput.next();
            System.err.println(word + " is not a number!");
        }
            int a = userInput.nextInt();
            System.out.println("Insert the value for B here:");
        while (!userInput.hasNextDouble()) {
            String word = userInput.next();
            System.err.println(word + " is not a number!");
        }
            int b = userInput.nextInt();
            System.out.println("Insert the value for C here:");
        while (!userInput.hasNextDouble()) {
            String word = userInput.next();
            System.err.println(word + " is not a number!");
        }
            int c = userInput.nextInt();

        //Invoke method.
        calculateUserinput(a, b, c);
    }

    public static void calculateUserinput(int a, int b, int c) {

        //Variables.
        int xOneSolution = ((-b) / (2 * a));
        double discriminant = (Math.pow(b, 2) - 4 * a * c);
        double formulaPlus = ((-b) + Math.sqrt(discriminant) / 2 * a);
        double formulaMinus = ((-b) - Math.sqrt(discriminant) / 2 * a);

        //If statements.
        if (discriminant < 0) {
            System.out.println("There is no solution");
        }
        else if (discriminant == 0){
            System.out.println("There is only one solution");
            System.out.println("x1 = " + xOneSolution);
        }
        else if (discriminant > 0){
            System.out.println("There is two solutions");
            System.out.printf("x1 = %.0f", formulaPlus);
            System.out.printf("\nx2 = %.0f", formulaMinus);
        }

    }

}
