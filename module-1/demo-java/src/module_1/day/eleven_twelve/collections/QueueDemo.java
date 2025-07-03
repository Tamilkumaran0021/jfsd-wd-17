package module_1.day.eleven_twelve.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // queue -> FIFO

        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(1);
        queue.add(0);

//        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.contains(0));
    }
}
