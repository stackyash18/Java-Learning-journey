import java.util.Scanner;

public class TableInReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numberof which you want the Multiplication Table: ");

        int num = input.nextInt();
        for (int i = 10; i > 0; i--) {
            System.out.println(num + "*" + i + "=" + (i * num));
        }
        input.close();
    }
}