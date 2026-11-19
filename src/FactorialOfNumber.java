import java.util.Scanner;

public class FactorialOfNumber {
    static void main(String[] args) {
        System.out.print("Enter the Number whose factorial you wish to calculate: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long result = calculateFactorial(num);
        System.out.println("Result: " + result);
    }

    public static long calculateFactorial(int num) {
        if (num < 2) {
            return 1;
        }
        int i = 2;
        long fact = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }

        return fact;
    }
}
