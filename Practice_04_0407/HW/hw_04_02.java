package Practice_04_0407.HW;

public class hw_04_02 {
    public static void main(String[] args) {
        ListQueue queue = new ListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue);

        int n = queue.dequeue();
        System.out.println(n);
        System.out.println(queue);

        n = queue.first();
        System.out.println(n);
        System.out.println(queue);

        n = queue.dequeue();
        n = queue.dequeue();
        n = queue.dequeue();
        System.out.println(queue);  // пусто

        // n = queue.dequeue();     // exception
        // n = queue.first();       // exception

        System.out.println();
        ListQueueT<String> queueString = new ListQueueT<>();
        queueString.enqueue("one");
        queueString.enqueue("two");
        queueString.enqueue("three");

        System.out.println(queueString);
        System.out.println(queueString.dequeue());
        System.out.println(queueString);
    }
}
