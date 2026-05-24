package AllInOneSystem.Systems;

public class VeryBasicCalculator {

    public static String getSystemName() {
        return "Very Basic Calculator";
    }

    public static String getSystemAuthor() {
        return "AI";
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Very Basic Calculator!");
        System.out.println("This calculator can perform addition, subtraction, multiplication, and division.");
        System.out.println("Please enter your calculation in the format: number operator number (e.g., 2 + 2)");
        System.out.println("Type 'exit' to quit the calculator.");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter calculation: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid format. Please try again.");
                continue;
            }

            try {
                double num1 = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double num2 = Double.parseDouble(parts[2]);
                double result;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, -, *, or /.");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid numbers. Please try again.");
            }
        }

        scanner.close();
    }
}
