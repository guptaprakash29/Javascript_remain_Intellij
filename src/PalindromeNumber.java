import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        System.out.print("Please Enter the Number You Wish to Check to See If It Is an Palindrome number or Not: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean result = isPalindrome(num);
        if (result) {
            System.out.println("Yes. This is Palindrome Number.");
        } else {
            System.out.println("No. this is notPalindrome Number");
        }

    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;


        }
        return reverse;
    }
}
