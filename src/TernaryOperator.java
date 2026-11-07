public class TernaryOperator {
    public static void main(String[] args) {

        // Check whether the user is an adult or a minor
        int userAge = 20;
        String result = (userAge >= 18) ? "Adult" : "Minor";
        System.out.println(result);


        // Check whether the number is even or odd
        int num = 50;
        String checkingResult = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(checkingResult);


        // Find the greatest number between two numbers
        int a = 10, b = 30;
        int max = (a > b) ? a : b;
        System.out.println("Greatest: " + max);


        // Assign a grade based on marks using nested ternary operators
        int marks = 85;
        String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 50) ? "C" : "Fail";

        System.out.println(grade);
    }
}
