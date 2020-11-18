import java.util.Random;

public class FifteenPuzzle {
    private final static int SIZE = 4;
    private int[][] board;

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void shuffle(int[] a) {
        Random r = new Random();
        for (int i = a.length - 1; i > 0; i--)
            swap(a, i, r.nextInt(i));
    }

    public FifteenPuzzle() {
        this.board = new int[SIZE][SIZE];
        int[] a = new int[SIZE * SIZE];
        for (int i = 0; i < a.length; i++)
            a[i] = i;
        shuffle(a);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                this.board[i][j] = a[i * SIZE + j];
        }
    }

    private void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(this.board[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FifteenPuzzle fp = new FifteenPuzzle();
        fp.printBoard();
    }
}
