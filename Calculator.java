/*
 * Calculator Project
 * ------------------
 * - Supports +, -, *, /, and % operations
 * - Handles invalid operations and division by zero
 * - Uses switch expressions for cleaner code
 * - Allows multiple operations until user chooses to exit
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the first number : ");
                float num1 = in.nextFloat();
                System.out.println("Enter operator (+, -, *, /, %) : ");
                String oper = in.next();
                System.out.println("Enter the second number : ");
                float num2 = in.nextFloat();
                float result = 0;
                switch (oper) {
                    case "+" ->
                        result = num1 + num2;
                    case "-" ->
                        result = num1 - num2;
                    case "*" ->
                        result = num1 * num2;
                    case "%" ->
                        result = num1 % num2;
                    case "/" -> {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Can't division by zero");
                        }
                    }
                    default -> {
                        System.out.println("Invalid operation");
                    }
                }
                System.out.println("Result = " + result);
                System.out.print("Do you want to do another operation? (y/n): ");
                char choice = in.next().charAt(0);
                if (choice == 'n' || choice == 'N') {
                    System.out.println("Exiting calculator... Thanks!");
                    break;
                }
            }
        }
    }
}
