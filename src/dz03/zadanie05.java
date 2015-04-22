package dz03;

import java.util.Scanner;

/**
 * Created by Jackal on 21.04.2015.
 */
public class zadanie05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter number: ");
        int size = s.nextInt();

        drawTriangleV1(size);
        drawTriangleV2(size);
        drawTriangleV3(size);
        drawTriangleV4(size);

        s.close();
    }

    private static void drawTriangleV4(int size) {
        System.out.println("Triangle version 4");

        for(int outsideStep = size ; outsideStep > 0  ; outsideStep-- ) {
            for (int insideStep = 1; insideStep <= outsideStep; insideStep++)
                System.out.print(insideStep + "\t");
            System.out.println();
        }

    }

    private static void drawTriangleV3(int size) {
        System.out.println("Triangle version 3");

        for(int outsideStep = size ; outsideStep > 0  ; outsideStep-- ) {
            for (int insideStep = 1; insideStep <= outsideStep; insideStep++)
                System.out.print(size - outsideStep + 1 + "\t");
            System.out.println();
        }

    }

    private static void drawTriangleV2(int size) {
        System.out.println("Triangle version 2");

        for(int outsideStep = 1 ; outsideStep <= size  ; outsideStep++ ) {
            for (int insideStep = 1; insideStep <= outsideStep; insideStep++)
                System.out.print(insideStep + "\t");
            System.out.println();
        }

    }

    private static void drawTriangleV1(int size) {
        System.out.println("Triangle version 1");

        for(int outsideStep = 1 ; outsideStep <= size  ; outsideStep++ ) {
            for (int insideStep = 1; insideStep <= outsideStep; insideStep++)
                System.out.print(outsideStep + "\t");
            System.out.println();
        }

    }
}
