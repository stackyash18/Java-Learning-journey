import java.util.Scanner;

public class SumOfMultiplicationOfTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find the Sum of its Multiplication Table: ");
        int num = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + (num * i);
        }

        System.out.println("The Sum of Multiplication Table of " + num + " is: " + sum);

        input.close();
    }
}
