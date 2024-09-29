package introToAlgorithms;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Hello to bubble sort");
        Integer[] a = {25, 8, 2, 3, 9, 15};
        System.out.println("Elements of Array before sort");
        List<Integer> lst = Arrays.asList(a);
        System.out.println(Arrays.asList(a));
        int count=a.length - 1;
        int tmp;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count-i; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }

            }
//            count--;
        }
        System.out.println("Elements of Array");
        lst = Arrays.asList(a);
        System.out.println(Arrays.asList(a));
//        System.out.println("Before Sort");
//        lst.stream().forEach(i -> System.out.print(" " + i));
//        System.out.println("After Sort");
//        System.out.println("");
//        lst.stream().sorted().forEach(i -> System.out.print(" " + i));
//
//        for(int i=0;i< a.length;i++){
//
//        }
    }
}
