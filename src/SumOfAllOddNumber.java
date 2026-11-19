import java.util.Scanner;

public class SumOfAllOddNumber {
    static void main(String[] args) {
        System.out.print("Enter the Number up to which you want the sum of odd Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = sum(num);
        System.out.println("Sum: " + result);
    }

    public static int sum(int num) {
        int i = 1, sum = 0;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
