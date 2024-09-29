package DSATopics.sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        int l = a.length;
        boolean swapped;
//        int j=1;
//        while(j<l-1){
//            swapped=false;
//            for(int i=l-1;i>=j;i--){
//                if(a[i] < a[i-1]){
//                    int temp;
//                    temp=a[i];
//                    a[i]=a[i-1];
//                    a[i-1]=temp;
//                    swapped=true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//            j++;
//        }

        for (int j = 1; j <= l; j++) {
            swapped=false;
            for (int i = l - 1; i >= j; i--) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                System.out.println("Array is sorted now hence BREAK the loop");
                break;
            }
        }
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));
    }
}

























