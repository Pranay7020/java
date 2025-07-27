import java.util.Scanner;


public class Calcu
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose operation: +  -  *  /");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }

        input.close();
    }
}

