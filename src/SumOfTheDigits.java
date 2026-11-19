import java.util.Scanner;

public class SumOfTheDigits {
    static void main(String[] args) {
        System.out.print("Enter the Number whose digits you want to sum: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = sumDigits(num);
        System.out.println("Result: " + result);
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
