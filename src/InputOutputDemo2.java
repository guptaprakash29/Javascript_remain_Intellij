import java.util.Scanner;

public class InputOutputDemo2 {

    static String name;
    static int age;

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        age = scanner.nextInt();
        scanner.close();
    }

    public static void showOutput() {
        System.out.println("Hello " + name);
        System.out.println("Woo! You're " + age + " years old.");
    }

    public static void main(String[] args) {
//        getInput();
//        showOutput();

        // Creating an object
        InputOutputDemo2 obj = new InputOutputDemo2();

        // Calling methods using object
        obj.getInput();
        obj.showOutput();
    }
}


