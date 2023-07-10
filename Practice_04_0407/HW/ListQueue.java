package Practice_04_0407.HW;

import java.util.LinkedList;

public class ListQueue {
    private LinkedList<Integer> list;

    public ListQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(int item) {
        list.add(item);
    }

    public int dequeue() {
        int result = this.first();
        list.remove(0);
        return result;
    }

    public int first() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
