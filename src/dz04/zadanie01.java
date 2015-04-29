package dz04;

/**
 * Created by Raccoon on 27.04.2015.
 */
public class zadanie01 {
    public static void main(String[] args) {
        System.out.println(searchMin(new int[]{10, 0, -15, 30}));
        System.out.println(searchMax(new int[]{10, 0, -15, 30}));
    }

    private static int searchMax(int[] array) {
        int max = array[0];

        for (int item : array)
        {
            if (max < item) max = item;
        }

        return max;
    }

    private static int searchMin(int[] array) {
        int min = array[0];

        for (int item : array)
        {
            if (min > item) min = item;
        }

        return min;
    }
}
