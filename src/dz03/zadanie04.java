package dz03;

import java.util.Scanner;

/**
 * Created by Jackal on 21.04.2015.
 */
public class zadanie04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter number: ");
        int size = s.nextInt();

        for(int outsideStep = 1 ; outsideStep <= size  ; outsideStep++ )
        {
            for (int insideStep = 1; insideStep <= size; insideStep++)
                System.out.print(insideStep * outsideStep + "\t");
            System.out.println();
        }

        s.close();
    }
}
