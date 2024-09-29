package collectionsDEmo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Customer c1=new Customer("Deepak","deepak@wipro.com");
        Customer c2=new Customer("Anil","anil@wipro.com");
        Customer c3=new Customer("Arnav","");

        Map<String,Customer> m1 = new HashMap<>();
        m1.put(c1.getEmail(),c1);
        m1.put(c2.getEmail(),c2);

//        System.out.println(c3.getName());
//        System.out.println(c3.getEmail());
    for(Map.Entry<String, Customer> c:m1.entrySet()){

        System.out.println(c.getKey());
        System.out.println(c.getValue().getName());
        System.out.println(c.getValue().getEmail());
        System.out.println("-------------");

    }


    }

}
