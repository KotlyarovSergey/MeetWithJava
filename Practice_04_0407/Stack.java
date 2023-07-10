// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

package Practice_04_0407;

public class Stack {
    int[] array;
    int top;

    public Stack(int size) {
        array = new int[size];
        top = -1;
    }
    public int size() {
        return top + 1;
    }
    public boolean empty() {
        return top == -1;
    }
    public void push(int num) {
        top++;
        array[top] = num;
    }
    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой!");
        }
        return array[top];
    }
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой!");
        }
        return array[top--];
    }
    public static void main(String[] args) {
        Stack st = new Stack(100);
        st.push(1);
        st.push(2);
        st.push(45);

        System.out.println("Size:" + st.size());
        System.out.println("Pop: " + st.pop());
        System.out.println("Size:" + st.size());
    }
}