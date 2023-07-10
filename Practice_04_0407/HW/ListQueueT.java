package Practice_04_0407.HW;

import java.util.LinkedList;

public class ListQueueT<T> {
    private LinkedList<T> list;

    public ListQueueT() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        T result = this.first();
        list.remove(0);
        return result;
    }

    public T first() {
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
