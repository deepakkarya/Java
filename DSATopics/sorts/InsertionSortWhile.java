package DSATopics.sorts;

import java.util.Arrays;

public class InsertionSortWhile {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        int len = a.length;
        int[] b = new int[a.length];
        int i = 1;
        int j = 0;
        int temp;

        while (i <= len - 1) {
            if (a[i] < a[i - 1]) {
                temp = a[i];
                j = i - 1;
                while (temp < a[j] && j >= 1) {
                    j--;
                }
                int position = i;
                while (position > j) {
                    a[position] = a[position - 1];
                    position--;
                }
                a[j] = temp;
            }
            i++;
        }
        System.out.println("Sorted Array");
        Arrays.stream(a).forEach(x -> System.out.print(x + " "));


    }

}
