public class LoopWhilePattern {

    public static void patterPrint() {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void main(String[] args) {
        patterPrint();
    }
}
