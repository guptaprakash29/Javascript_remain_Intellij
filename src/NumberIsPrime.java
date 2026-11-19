import java.util.Scanner;

public class NumberIsPrime {
    static void main(String[] args) {
        System.out.print("Please enter the number you wish to look up: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean result = isPrime(num);
        if (result) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }


    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;

        }
        return true;
    }
}
