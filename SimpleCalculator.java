import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid operation choice.");
            return;
        }

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        String operation = "";

        switch (choice) {
            case 1:
                result = num1 + num2;
                operation = "Addition";
                break;
            case 2:
                result = num1 - num2;
                operation = "Subtraction";
                break;
            case 3:
                result = num1 * num2;
                operation = "Multiplication";
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                result = num1 / num2;
                operation = "Division";
                break;
        }

        System.out.println(operation + " result: " + result);
    }
}
