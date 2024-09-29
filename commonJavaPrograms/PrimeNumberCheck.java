package commonJavaPrograms;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int first=1;
        int num=31;

        System.out.println(checkPrintNumber(num));

    }

    private static boolean checkPrintNumber(int num) {

        for(int i=1;i<num;i++){
            if(num % i == 0){
                System.out.println(num + " was divisible by " +i);
                return false;
            }
        }

        return true;
    }
}
