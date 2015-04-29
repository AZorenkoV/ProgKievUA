package Lesson05;

/**
 * Created by Raccoon on 27.04.2015.
 */
public class ChristmasTree {
    public static final int STOREYS_QUANTITY = 5;

    public static void main(String[] args) {
        printChristmasTree();
    }

    private static void printChristmasTree() {
        for (int storeyIndex = 0; storeyIndex < STOREYS_QUANTITY; storeyIndex++) {
            printStorey(storeyIndex);
        }
    }

    private static void printStorey(int storeyIndex) {
        int blacksQuantity = 1;
        int leftWhitesQuantity = STOREYS_QUANTITY;
        int rowsQuantity = 2 + storeyIndex;

        for (int row = 0; row < rowsQuantity; row++) {
            for (int i = 0; i < leftWhitesQuantity; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < blacksQuantity; i++) {
                System.out.print("*");
            }
            System.out.println();

            blacksQuantity += 2;
            leftWhitesQuantity--;
        }
    }
}