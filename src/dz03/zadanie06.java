package dz03;

/**
 * Created by Jackal on 21.04.2015.
 */
public class zadanie06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(sum(a, b));
        System.out.println(abs(a, b));
        System.out.println(signum(a));
        System.out.println(isEven(a));
        System.out.println(isOdd(a));
        System.out.println(isPrime(a));
        System.out.println(pow(a, b));
        System.out.println(isPower(a, b));
    }

    private static int isPower(int a, int b) {

        return 0;
    }

    private static int pow(int a, int b) {
        int extent = 1;
        for (int i = 0; i < b; i ++)
            extent *= a;
        return extent;

    }

    private static boolean isPrime(int a) {
        int marker = 0;
        for (int i = 2; i < a; i++) {
            if ((a % i) != 0) marker++;
        }
        if (marker > 0) return false;
        return true;
    }

    private static boolean isOdd(int a) {
        if ((a % 2) != 0) return true;
        return false;
    }

    private static boolean isEven(int a) {
        if ((a % 2) == 0) return true;
        return false;
    }

    private static int signum(int a) {
        if (a == 0 ) return 0;
        else if (a > 0) return 1;
        else return -1;
    }

    private static int abs(int a, int b) {
        return a % b;
    }

    private static int sum(int a, int b) {
        return a + b;
    }



}
