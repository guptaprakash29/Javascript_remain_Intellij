import java.util.Scanner;

public class ReverseDigits {
    static void main(String[] args) {
        System.out.print("Please enter the number you wish to look up: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = reverseNumber(num);
        System.out.print("Result: " + result);
    }

    public static int reverseNumber(int num) {
        int rNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            rNumber = rNumber * 10 + digit;
            num /= 10;

        }
        return rNumber;
    }
}
