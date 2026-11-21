import java.util.Scanner;

public class ChallengePattern {
    static void main(String[] args) {
        System.out.print("Enter the Number required for the pattern row: ");
        Scanner input = new Scanner(System.in);
        int noOfRow = input.nextInt();
        System.out.println("RightHalfPyramid");
        printRightHalfPyramid(noOfRow);
        System.out.println("printReverseRightHalfPyramid");
        printReverseRightHalfPyramid(noOfRow);
        System.out.println("printLeftHalfPyramid");
        printLeftHalfPyramid(noOfRow);
    }

    public static void printLeftHalfPyramid(int maxRow) {
        int rows = maxRow;
        while (rows > 0) {
            //this loop print spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print(" ");
                j++;

            }
            //this loops print stars
            int i = 0;
            while (i <= (maxRow - rows)) {
                System.out.print("*");
                i++;

            }
            System.out.println();
            rows--;

        }


    }

    public static void printReverseRightHalfPyramid(int num) {
        while (num > 0) {
            int i = 0;
            while (i < num) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            num--;

        }
    }

    public static void printRightHalfPyramid(int num) {
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        /*
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/


    }

}
