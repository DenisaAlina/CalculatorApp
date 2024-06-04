package se.lexicon;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String exitButton;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter the second number: ");
            int secondNumber = sc.nextInt();
            System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
            String operation = sc.next();
            int result = performOperation(firstNumber, secondNumber, operation);
            System.out.println("Your answer is: " + result);
            System.out.print("Enter 'exit' if you want to exit the program");
            exitButton = sc.next();
        } while (!exitButton.equalsIgnoreCase("exit"));
    }

    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
        }
        else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }
    }

