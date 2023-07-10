package Practice_04_0407;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_0 {

    public static void main(String[] args) {

        int len = 100_000;
        long getTimeAL = getArrayListAddLast(len);
        long getTimeLL = getLinkedListAddLast(len);
        System.out.println("Добавление в конец ArrayList - " + getTimeAL);
        System.out.println("Добавление в конец LinkedList - " + getTimeLL);

        System.out.println();
        long getTimeALfirst = getArrayListAddFirst(len);
        long getTimeLLfirst = getLinkedListAddFirst(len);
        System.out.println("Добавление в начало ArrayList - " + getTimeALfirst);
        System.out.println("Добавление в начало LinkedList - " + getTimeLLfirst);

        System.out.println();
        int pos = 50_000;
        long getTimeALmiddle = getArrayListAddMiddle(len, pos);
        long getTimeLLmiddle = getLinkedListAddMiddle(len, pos);
        System.out.println("Добавление в середину ArrayList - " + getTimeALmiddle);
        System.out.println("Добавление в середину LinkedList - " + getTimeLLmiddle);

    }

    private static long getArrayListAddLast(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddLast(int len) {
        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            linkedList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getArrayListAddFirst(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            arrayList.add(0, i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddFirst(int len) {
        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            linkedList.add(0, i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getArrayListAddMiddle(int len, int pos) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            if (arrayList.size() > pos)
                arrayList.add(pos, i);
            else
                arrayList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddMiddle(int len, int pos) {
        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            if (linkedList.size() > pos)
                linkedList.add(pos, i);
            else
                linkedList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }
}
