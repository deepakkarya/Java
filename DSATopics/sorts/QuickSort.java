package DSATopics.sorts;

/*Quick Sort Algorithm Steps
Choose a Pivot: Select an element from the array as the pivot. Various strategies can be used to select the pivot
(e.g., first element, last element, middle element, or a random element).
Partitioning: Rearrange the array so that elements less than the pivot come before it and elements greater
than the pivot come after it. The pivot is now in its final position.
Recursion: Recursively apply the above steps to the sub-arrays of elements less than and greater than the pivot.

Quick Sort with Leftmost Element as Pivot
Choose the Pivot: Select the leftmost element of the array as the pivot.
Partitioning: Rearrange the array so that elements less than the pivot come before it, and elements greater than the pivot come after it.
Recursion: Recursively apply the same logic to the sub-arrays.
Steps Involved
Start with an array.
Select the leftmost element as the pivot.
Rearrange the array based on the pivot.
Recursively sort the left and right partitions.

*/
public class QuickSort {
    public static void main(String args[])
    {
        // quick sort = moves smaller elements to left of a pivot.
        //			   recursively divide array in 2 partitions

        //                       run-time complexity = Best case O(n log(n))
        //				   		                   Average case O(n log(n))
        //				   		                   Worst case O(n^2) if already sorted

        //                       space complexity    = O(log(n)) due to recursion

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.print(i + " ,");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
