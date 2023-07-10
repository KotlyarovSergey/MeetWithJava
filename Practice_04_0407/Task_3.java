// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.


package Practice_04_0407;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_3 {
    public static void main(String[] args) {

        int[] arrayList = { 1,4,6,7,60,26,8,9,33,45,76367,223,4,0,2};
        printStack(arrayList);
        System.out.println();
        printQueue(arrayList);
    }

    public static void printStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        // for (Integer elem : stack) {
        // System.out.print(elem+" ");
        // }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(stack.isEmpty());

    }

    public static void printQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        // for (Integer element : queue) {
        // System.out.print(element+" ");
        // }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println(queue.isEmpty());
    }
}