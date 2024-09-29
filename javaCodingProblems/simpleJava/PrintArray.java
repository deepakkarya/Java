package javaCodingProblems.simpleJava;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintArray {

    public static void main(String[] args) {
        String[] arr = {"one","two","three","four"};
        Arrays.asList(arr).stream().forEach(s-> System.out.print(s+" "));
        Arrays.stream(arr).map(s->s+" space").forEach(System.out::println);
        Arrays.stream(arr).map(String::toUpperCase).forEach(System.out::println);

        Stream.of(arr).forEach(s-> System.out.println(s));
        System.out.println("----------");
        Stream.of(arr).forEach(System.out::println);
        System.out.println("--Newest for--");
        for(String s:arr){
            System.out.println("String "+s);
        }
        System.out.println("--Oldest for--");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("To String method "+Arrays.toString(arr));

        System.out.println("Collectors method: "+Arrays.stream(arr).collect(Collectors.joining(" ")));

    }
}
