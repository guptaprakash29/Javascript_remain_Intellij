import java.util.Scanner;

public class ArthmaticOperators {
    public static void operators(int a, int b) {
        System.out.println("Addition:" + (a + b));
        System.out.println("Substraction" + (a - b));
        System.out.println("Multiplication:" + (a * b));
        System.out.println("Division:" + (a / b));
        System.out.println("Modulus:" + (a % b));
        //Java does't have Exponentiation '**' operator like:Javascript.
        System.out.println("Exponentiation:"+Math.pow(a,b));
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter First Number:");
        num1 = value.nextInt();
        System.out.print("Enter Second Number:");
        num2 = value.nextInt();
        operators(num1, num2);
    }
}
