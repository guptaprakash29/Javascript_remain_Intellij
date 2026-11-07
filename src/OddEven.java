import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter Number To Checking Is Even or Odd:");
        Scanner value = new Scanner(System.in);
        int num = value.nextInt();
        if(num%2==0){
            System.out.println(num+" Even Number.");
        }else{
            System.out.println(num+" Odd Number");
        }
    }
}
