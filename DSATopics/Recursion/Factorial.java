package DSATopics.Recursion;

public class Factorial {

    public static void main(String[] args) {
        int num=5;
        System.out.println("Factorial is:= "+getFactorial(num));
    }

    private static int getFactorial(int num) {
        if(num==1)
            return 1;
        System.out.print(num +" x ");
        return num*getFactorial(num-1);
    }

}
