public class MyPuzzle {
    public static void main(String[] args) {
        int j = 0;

        while (j < 4) {
            System.out.print("a");
            if (j < 1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if (j > 1) {
                System.out.print(" oyster");
                j = j + 2;
            }
            if (j == 1) {
                System.out.print("noys");
            }
            if (j < 1) {
                System.out.print("oise");
            }
            System.out.print(" ");
            j = j + 1;
        }
    }
}
