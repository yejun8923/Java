package ArrayList;

import java.util.ArrayList;

class MyQueue {

    private ArrayList<String> arrayqueue = new ArrayList<>();

    public void inQueue(String data){
        arrayqueue.add(data);
    }

    public String deQueue(){
        if(arrayqueue.size() == 0){
            System.out.println("빈 큐");
            return null;
        }
        return arrayqueue.remove(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.inQueue("A");
        queue.inQueue("B");
        queue.inQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.inQueue("D");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
