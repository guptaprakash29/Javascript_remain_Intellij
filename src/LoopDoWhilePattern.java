public class LoopDoWhilePattern {

    public static void patternPrint() {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;

        } while (i <= 7);
    }

    static void main(String[] args) {
        patternPrint();
    }
}
