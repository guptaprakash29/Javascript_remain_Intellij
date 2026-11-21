import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        System.out.print("Please Enter the Number You Wish to Check to See If It Is an Armstrong number or Not: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean result = isArmstrong(num);
        if (result) {
            System.out.println("Yes. This is an Armstrong Number.");

        } else {
            System.out.println("No. Not an Armstrong Number.");
        }

    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int finalNumber = 0;
        int numCopy=num;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += power(lastDigit, noOfDigits);
        }

        return finalNumber == numCopy;
    }

    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }
}
