// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Practice_03_3006.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw_03_02 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 5, 8, 6, 8, 12, 9, 4};
        // Integer[] array = new Integer[]{8, 6, 8, 12, 4};
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, array);

        System.out.println(list1);
        removeEven(list1);
        System.out.println(list1);
    }

    static void removeEven(List<Integer> data){
        for (int i = 0; i < data.size(); ) {
            if(data.get(i) % 2 == 0) data.remove(i);
            else i++;
        }
    }
}
