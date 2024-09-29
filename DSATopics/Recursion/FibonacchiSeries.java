package DSATopics.Recursion;

public class FibonacchiSeries {

    public static void main(String[] args) {
        int number = 5;
        int first = 0;
        int second = 1;

        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("Fibinachhi series is:");
//        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        int sum;
//        System.out.print(first + " " + second + " ");
//        for (int i = 0; i <= 10; i++) {
//            sum = first + second;
//            first = second;
//            second = sum;
//            System.out.print(sum + " ");
//        }

        System.out.println("Print fibonachi using recuirsion");

        printFibonacchi(number, first, second);

    }

    private static void printFibonacchi(int number, int first, int second) {
        while (number > 1) {
            if(number==0){
                break;
            }
            number--;
            int sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
            printFibonacchi(number, first, second);
        }
    }
}
