package DSATopics.sorts;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        quickSort(a, 0, a.length - 1);

        // Display sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Sort elements before partition
            quickSort(arr, pi + 1, high); // Sort elements after partition
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = (low - 1);     // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }
}

