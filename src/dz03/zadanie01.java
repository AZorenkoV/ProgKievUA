package dz03;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Jackal on 21.04.2015.
 */
public class zadanie01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your surname: ");
        String sname = s.nextLine();

        System.out.print("Enter your age: ");
        try {
            int age = s.nextInt();

            if (age > 0 && age < 120)
                System.out.println("I'm " + name + " " + sname + ", " + age + " years old ");
            else
                System.out.println("Illegal age");
        }
        catch(InputMismatchException ime){
            System.out.println("Illegal age");
        }

        s.close();
    }
}
