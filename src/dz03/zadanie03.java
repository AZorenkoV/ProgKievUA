package dz03;

import java.util.Scanner;

/**
 * Created by Jackal on 21.04.2015.
 */
public class zadanie03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter number: ");
        for(int border = s.nextInt(); border >= 0  ; border-- )
            if ((border % 2) == 0) System.out.print(border + " ");

        s.close();
    }
}
