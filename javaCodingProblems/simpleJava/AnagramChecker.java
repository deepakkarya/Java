package javaCodingProblems.simpleJava;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {

        String str1="listen";
        String str2="silentn";

        System.out.println(checkAnagram(str1,str2));

    }

    private static boolean checkAnagram(String str1, String str2) {

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
