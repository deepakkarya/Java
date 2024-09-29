package DSATopics.sorts;

import java.util.Arrays;

public class MergeSort {

    public static void split(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {
        int index = 0;
        int secondHalfStartIndex = listFirstHalf.length;
        for (int elements : listToSort) {
            if (index < secondHalfStartIndex) {
                listFirstHalf[index] = listToSort[index];
            } else {
                listSecondHalf[index - secondHalfStartIndex] = listToSort[index];
            }
            index++;
        }
    }

    public static void merge(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {
        int mergeIndex = 0;
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;

        while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length) {
            if (listFirstHalf[firstHalfIndex] < listSecondHalf[secondHalfIndex]) {
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else {
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
            mergeIndex++;
        }
        if(firstHalfIndex < listFirstHalf.length){
            while(mergeIndex < listToSort.length){
                listToSort[mergeIndex]= listFirstHalf[firstHalfIndex];
                mergeIndex++;
                firstHalfIndex++;
            }
        }
        if(secondHalfIndex < listSecondHalf.length){
            while(mergeIndex < listToSort.length){
                listToSort[mergeIndex]= listSecondHalf[secondHalfIndex];
                mergeIndex++;
                secondHalfIndex++;
            }
        }
    }

    public static void mergeSort(int[] listToSort){

        if(listToSort.length == 1){
            return;
        }
        int midIndex=listToSort.length/2+listToSort.length % 2;
        int[] listFirstHalf = new int[midIndex];
        int[] listSecondHalf= new int[listToSort.length-midIndex];
        split(listToSort,listFirstHalf,listSecondHalf);

        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);

        merge(listToSort,listFirstHalf,listSecondHalf);
//        print(listToSort);

    }

    private static void print(int[] a) {

        Arrays.stream(a).forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        mergeSort(a);
        print(a);
    }
//complexity is O(NLOGN)

    //Not adaptive
    //O(N) extra space
    //Stable Sort
    //Divide and Conquer
    //

}


//Split method
//Merge method to merge 2 sorted lists into one sorted list
//MergeSort method which does the final recursive sort