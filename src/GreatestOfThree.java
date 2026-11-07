import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter All Three Number One-By-One:");
        Scanner value = new Scanner(System.in);
        int num1 = value.nextInt();
        int num2 = value.nextInt();
        int num3 = value.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Greatest Number:" + num1);

        } else if (num2 >= num3) {
            System.out.println("Gretaest Number:" + num2);

        } else {
            System.out.println("Greatest Number:" + num3);
        }

    }
}
