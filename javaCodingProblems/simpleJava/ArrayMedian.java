package javaCodingProblems.simpleJava;

import java.util.Arrays;

public class ArrayMedian {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 4, 3,6};
        float median = getMedian(arr);
        System.out.println("Meidan of array is: " + median);

    }

    private static float getMedian(int[] arr) {
        float n;
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            n=(float)(arr[arr.length/2-1]+arr[(arr.length/2)])/2;
        }else{
            n=arr[arr.length/2];
        }
        return n;
    }
}
// 1 2 3 4 5 6