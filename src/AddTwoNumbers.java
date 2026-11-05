import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner val = new Scanner(System.in);
        System.out.print("Enter First Number:");
        num1 = val.nextInt();
        System.out.print("Enter Second Number");
        num2 = val.nextInt();
        System.out.println("Addition:\n" + num1 + "+" + num2 + "="+(num1 + num2));


    }
}
