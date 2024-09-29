package javaCodingProblems.simpleJava;

public class CalculatenCr {
    public static int calnCr(int n, int r) {
        int ncr = 0;
        if (n < r) {
            ncr = 0;
            return ncr;
        } else {
            ncr = calFactorial(n) / (calFactorial(r) * calFactorial(n - r));
        }
        return ncr;
    }
    private static int calFactorial(int i) {
        if (i == 1)
            return 1;
        return i * calFactorial(i - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int ncr = calnCr(n, r);
        System.out.println(ncr);
    }



}
