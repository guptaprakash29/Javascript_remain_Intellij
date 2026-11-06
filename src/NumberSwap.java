public class NumberSwap {
    public static void main(String[] args) {
        int num1 = 5, num2 = 50;
        int container;
        container = num2;
        num2 = num1;
        num1=container;
        System.out.println(num1+" "+num2);
    }
}
