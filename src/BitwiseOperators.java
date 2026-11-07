public class BitwiseOperators {
    public static void main(String[] args) {
        int num = 10;
        //Example 1: Check Even or Odd (&)
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Example 2: Multiply by 2 (<<)
        System.out.println(num << 1);

        //Example 3: Divide by 2 (>>)
        System.out.println(num >> 1);

        //Example 4: Swap two numbers (^)
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
