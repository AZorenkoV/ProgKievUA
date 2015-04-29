package dz04;

/**
 * Created by Raccoon on 27.04.2015.
 */
public class zadanie02 {
    public static void main(String[] args) {
        System.out.println(leanerSearch(new int[] {10, 0, -15, 30} , 15));
        System.out.println(leanerSearch(new int[] {10, 0, -15, 30} , 0));
    }

    private static int leanerSearch(int[] arrays, int search) {

        for(int i = 0; i < arrays.length; i++)
            if (arrays[i] == search) return i;

        return -1;
    }
}
