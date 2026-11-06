public class ParameterArgument {
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);

    }

    public static int multiplication(int num1, int num2) {
//        int result = num1 * num2;
        return num1 * num2;
    }

    public static void main(String[] args) {
        add(25, 25);
        int answer = multiplication(10, 5);
        System.out.println(answer);
    }
}
