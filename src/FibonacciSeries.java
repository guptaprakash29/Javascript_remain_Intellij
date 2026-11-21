import java.util.Scanner;

public class FibonacciSeries {
    static void main(String[] args) {
        System.out.print("Please Enter the Number Up To Which Fibonacci Series should be displayed: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        int f_num = 0, s_num = 1;
        while (f_num + s_num <= num) {
            int third_num = f_num + s_num;
            System.out.print(third_num + " ");
            f_num = s_num;
            s_num = third_num;

        }
    }
}
