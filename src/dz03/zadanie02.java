package dz03;

import java.util.Scanner;

/**
 * Created by Jackal on 21.04.2015.
 */
public class zadanie02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int summa = 0;

        System.out.print("Please enter number: ");
        int number = s.nextInt();
        while(number != 0) {
            summa += number;
            number = s.nextInt();
        }

        System.out.println(summa);

        s.close();
    }
}
