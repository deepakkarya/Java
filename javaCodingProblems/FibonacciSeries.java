package javaCodingProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FibonacciSeries {
    //0,1,1,2,3,5,8
    public static void main(String[] args) {
        Integer n=10;
        Integer first=0;
        Integer second=1;
        List<Integer> fibList = getFibonacciSeries(n,first,second);
        System.out.println(fibList);
    }
    private static List<Integer> getFibonacciSeries(Integer n, Integer first, Integer second) {
        List<Integer> fibList = new LinkedList<>();
        fibList.add(0,first);
        fibList.add(1,second);
        for(int i=2;i<n;i++){
            fibList.add(i, fibList.get(i-1)+fibList.get(i-2));
        }
        return fibList;
    }

}
