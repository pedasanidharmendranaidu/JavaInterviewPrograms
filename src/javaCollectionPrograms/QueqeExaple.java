package javaCollectionPrograms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueqeExaple {
    public static void main(String[] args) {
        Queue queue=new PriorityQueue();
//        queue.add(1);
       queue.add("a");
        queue.add("c");
        queue.add("c");
//        queue.add(2);
     //  queue.add("c");
       queue.add("i");
      queue.add("max");
      queue.add("4");
   //   queue.add(null);
//        queue.add(1.2323);
//        queue.add(null);
//        queue.add(null);
//        queue.add(null);
//        queue.add("c");
        System.out.println(queue);
        System.out.println("peeek : "+queue.peek());
        System.out.println("pollll : "+queue.poll());
        System.out.println(queue);
        System.out.println(queue.size());

    }

}
