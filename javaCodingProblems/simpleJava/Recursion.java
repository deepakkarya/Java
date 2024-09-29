package javaCodingProblems.simpleJava;

public class Recursion {

    public static void main(String[] args) {
        int n=5;
        int mul=getFactorial(n);
        System.out.println(" = "+mul);
    }

    private static int getFactorial(int n) {
        System.out.print(n +" x ");
        if(n==1){
            return 1;
        }

        return n*getFactorial(n-1);
    }

}
