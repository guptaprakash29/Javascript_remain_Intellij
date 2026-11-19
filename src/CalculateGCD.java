import java.util.Scanner;

public class CalculateGCD {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers sequentially for which we need to find the GCD: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = calculateGCD(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int calculateGCD(int num1, int num2) {
        int gcd = 1, i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;

        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;

        }
    }
}
