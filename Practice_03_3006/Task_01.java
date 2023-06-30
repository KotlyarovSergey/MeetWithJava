// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

package Practice_03_3006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<Integer>(n);
        System.out.println(list.size());
        for(int i = 0; i < n; i++){
            int number = (int)(Math.random() * 100);
            // list.add(number);
            list.add(i, number);

        }
        Collections.sort(list);
        System.out.println(list.toString());
        // System.out.println(list[2]);
    }
}
