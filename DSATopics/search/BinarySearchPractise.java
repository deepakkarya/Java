package DSATopics.search;

public class BinarySearchPractise {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int answer = binarySearchImplement(array, 7);

        System.out.println("Answer is at index: "+answer);
    }

    private static int binarySearchImplement(int[] array, int number) {
    int min=0;
    int max= array.length-1;
    while(min<=max){
        int mid=min+(max - min)/2;
        if(array[mid] == number)
            return mid;
        if(array[mid] > number)
            max=mid-1;
        else
            min=mid+1;
    }

    return -1;
    }


}
