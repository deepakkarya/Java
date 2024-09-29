package commonJavaPrograms;

public class PrimeNumberPrinter {

    public static void main(String[] args) {
        int start=20;
        int end=100;

        printPrimeNumbers1(start,end);
    }

    private static void printPrimeNumbers1(int start, int end) {
        int s=start;
        int e=end;
        int count;
        while(s <= e){
            count=0;
            for(int x=2;x<s/2;x++){
                if(s % x == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(s+" is Prime");
            }
            s++;
        }

    }

}
