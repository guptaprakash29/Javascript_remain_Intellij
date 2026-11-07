import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        System.out.print("Please Enter Number For Checking:");
        Scanner value = new Scanner(System.in);
        int givenNumber = value.nextInt();
        if (givenNumber > 0) {
            System.out.print(givenNumber + " is Positive Number.");
        } else if (givenNumber < 0) {
            System.out.println(givenNumber + " Is Negative Number");

        } else {
            System.out.println("Your Number is Zero.");
        }
    }
}
