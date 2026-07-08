package DSA.Patterns;

public class Sample {
    public static void main(String args[]) {

        int rows = 3;
        int cols = 7; // total width

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // Row 1
                if (i == 1 && (j == 1 || j == 4 || j == 7)) {
                    System.out.print("* ");
                }

                // Row 2
                else if (i == 2 && (j >= 2 && j <= 5)) {
                    System.out.print("* ");
                }

                // Row 3
                else if (i == 3 && (j == 3 || j == 5)) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
