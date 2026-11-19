import java.util.Scanner;

public class CalculateLCM {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers sequentially for which we need to find the LCM: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = calculateLCM(num1, num2);
        System.out.println("Result: " + result);
    }


    public static int calculateLCM(int num1, int num2) {
        int i = 1;
        //while(true){
        while (i <= num2) {
            int LCM = num1 * i;
            if (LCM % num2 == 0) {
                return LCM;
            }
            i++;

        }

        return 0;   //unreachable
    }

}

/*
50
40
Result: 200
*/
