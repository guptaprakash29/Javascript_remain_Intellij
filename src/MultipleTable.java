import java.util.Scanner;

public class MultipleTable {
    static void main(String[] args) {
        System.out.print("Type in the number for the table you want:  ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        multiplication(num);
        input.close();
    }

    public static void multiplication(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }
    }
}
