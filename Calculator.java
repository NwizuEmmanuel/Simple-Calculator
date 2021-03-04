/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Calculator {
    public static void main(String[] args) {
        /* Headline */
        System.out.println("Simple Calculator\nWritten in: Java\nBy: Onyeka");
        System.out.println("To run this calculator one must an operator.");
        System.out.println("1 Addition\n2 Subtraction\n3 Multiplication\n4 Division\nchoose any number from 1-4 to any of the listed operator.");
        System.out.println("Enter a number: ");
        /* End */
        /*Initial input*/
        Scanner inputField = new Scanner(System.in);
        int inputField2 = inputField.nextInt();
        /*End*/
        /* calculator */
        if (inputField2 ==  1) {
            System.out.println("Math operator: Addition.");
            System.out.println("Enter first number(s): ");
            double addFirstNum = inputField.nextDouble();
            System.out.println("Enter second number(s): ");
            double addSecondNum = inputField.nextDouble();
            double addResult = addFirstNum + addSecondNum;
            System.out.println(addFirstNum + " + " + addSecondNum);
            System.out.println("Ans: " + addResult);
        }else if (inputField2 == 2) {
            System.out.println("Math operator: Subtraction.");
            System.out.println("Enter first number(s): ");
            double subFirstNum = inputField.nextDouble();
            System.out.println("Enter second number(s)");
            double subSecondNum = inputField.nextDouble();
            double sudResult = subFirstNum - subSecondNum;
            System.out.println(subFirstNum + " - " + subSecondNum);
            System.out.println("Ans: " + sudResult);
        }else if (inputField2 == 3) {
            System.out.println("Math operator: Multplication.");
            System.out.println("Enter first number(s): ");
            double multFirstNum = inputField.nextDouble();
            System.out.println("Enter second number(s)");
            double multSecondNum = inputField.nextDouble();
            double multResult = multFirstNum * multSecondNum;
            System.out.println(multFirstNum + " * " + multSecondNum);
            System.out.println("Ans: " + multResult);
        }else if (inputField2 == 4) {
            System.out.println("Math operation: Division.");
            System.out.println("Enter first number(s): ");
            double divFirstNum = inputField.nextDouble();
            System.out.println("Enter second number(s)");
            double divSecondNum = inputField.nextDouble();
            double divResult = divFirstNum / divSecondNum;
            System.out.println(divFirstNum + " / " + divSecondNum);
            System.out.println("Ans: " + divResult);
        }else{
            System.out.println("Invalid operator");
            System.out.println("Number typed not related.");
        }
        /* End */
    }
}
