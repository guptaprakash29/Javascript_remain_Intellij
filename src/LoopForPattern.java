public class LoopForPattern {
    public static void patternPrint() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        patternPrint();
    }

}
