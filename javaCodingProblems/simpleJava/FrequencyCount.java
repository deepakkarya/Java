package javaCodingProblems.simpleJava;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        String str = "this is a map test";

        Map<Character,Integer> mp=new HashMap<>();
        char[] ch = str.replace(" ","").toCharArray();
        for(int i=0;i<ch.length;i++){
            if(mp.containsKey(ch[i])){
                mp.put(ch[i],mp.get(ch[i])+1);
            }else{
                mp.put(ch[i],1);
            }
        }
        System.out.println(mp);


    }
}
