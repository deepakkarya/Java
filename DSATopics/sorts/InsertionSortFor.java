package DSATopics.sorts;

import java.util.Arrays;

public class InsertionSortFor {

    public static void main(String[] args) {

        int[] a = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        int len = a.length;

        for (int i = 1; i < len; i++) {
            int temp = a[i];
            int j = i - 1;

            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;

        }
        Arrays.stream(a).forEach(x -> System.out.print(x + " "));


    }
}
