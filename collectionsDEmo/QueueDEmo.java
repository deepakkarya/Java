package collectionsDEmo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDEmo {
    public static void main(String[] args) {
        System.out.println("Queue Demo");
        Queue<String> queue = new ArrayDeque<>();
//        queue.add("c");
//        queue.add("a");
//        queue.add("b");
        //peek to check element at the front
        //remove to remove element from the front
        //poll
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue);
        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());


    }
}
