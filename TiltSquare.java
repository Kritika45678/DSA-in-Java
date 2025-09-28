
    public class TiltSquare {
    public static void main(String[] args) {
        int size = 4;

        // Top half
        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) System.out.print("  ");
            for (int star = 1; star <= 2 * row - 1; star++) System.out.print("* ");
            System.out.println();
        }

        // Bottom half
        for (int row = size; row >= 1; row--) {
            for (int space = 1; space <= size - row; space++) System.out.print("  ");
            for (int star = 1; star <= 2 * row - 1; star++) System.out.print("* ");
            System.out.println();
        }
    }
}


