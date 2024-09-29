package arrays;

import java.util.Arrays;

public class ArrayReversal {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        int revArr[] = reverseArr(a);
        Arrays.stream(revArr).forEach(System.out::print);
    }

    private static int[] reverseArr(int[] a) {
        int i = 0;
        int j = a.length - 1;
        System.out.println(i + " " + j);
        while (i < j) {
            int tmp;
            tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;

            i++;
            j--;
        }
        return a;
    }

}
