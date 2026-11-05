import java.util.Scanner;

public class AddTwoNumber2 {
    static int num1, num2;

    public static void inputVal() {
        Scanner val = new Scanner(System.in);
        System.out.print("Enter First Number:");
        num1 = val.nextInt();
        System.out.print("Enter Second Number");
        num2 = val.nextInt();
    }

    public static void showResult() {
        System.out.println("Addition:\n" + num1 + "+" + num2 + "=" + (num1 + num2));
    }

    public static void main(String[] args) {
        inputVal();
        showResult();
    }
}
