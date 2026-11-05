import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = value.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Enter Your Age:");
        int age = value.nextInt();
        System.out.println("Woo! You're" + age);
    }
}
