package Lesson05;

/**
 * Created by Raccoon on 27.04.2015.
 */
public class LeftDirectionArrows {
    public static final int ARROWS_QUANTITY = 3;
    public static final int ARROW_SIZE = 5;

    public static void main(String[] args) {
        printLeftDirectionArrows();
    }

    private static void printLeftDirectionArrows() {
        for (int blacksInRow = 1; blacksInRow <= ARROW_SIZE; blacksInRow++) {
            printArrowsRow(blacksInRow);
        }
        for (int blacksInRow = ARROW_SIZE - 1; blacksInRow >= 1; blacksInRow--) {
            printArrowsRow(blacksInRow);
        }
    }

    private static void printArrowsRow(int blacksInRow) {
        for (int arrowIndex = 0; arrowIndex < ARROWS_QUANTITY; arrowIndex++) {
            printArrowRow(blacksInRow);
        }
        System.out.println();
    }

    private static void printArrowRow(int blacksInRow) {
        int whitesInRow = ARROW_SIZE - blacksInRow;
        for (int i = 0; i < whitesInRow; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < blacksInRow; i++) {
            System.out.print("*");
        }
        System.out.print("|");
    }
}