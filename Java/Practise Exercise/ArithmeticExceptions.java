import java.util.Scanner;

public class ArithmeticExceptions {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of dividend: ");
        int a = input.nextInt();

        System.out.print("Enter the value of divisor: ");
        int b = input.nextInt();

        try {
            int result = a / b;
            System.out.printf("Result is %d", result);
        } 
        catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }

        input.close();
    }
}