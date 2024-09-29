package javaCodingProblems.simpleJava;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madama";
        System.out.println(checkPalindrome(str));;
    }

    private static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        return str.contentEquals(sb);

    }
}
