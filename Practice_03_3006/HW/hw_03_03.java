// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

package Practice_03_3006.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw_03_03 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 7, 1, 5, 8, 6, 8, 12, 9, 4 };
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, array);
        System.out.println(list1);

        System.out.printf("Min = %d, max = %d, mid = %.2f", getMin(list1), getMax(list1), getMedium(list1));
        
        if (getMax(list1) != Collections.max(list1))
            System.out.println("I was Wrong");
        if (getMin(list1) != Collections.min(list1))
            System.out.println("I was Wrong");
    }

    static Integer getMin(List<Integer> data) {
        if (data.size() == 0)
            return null;
        Integer minValue = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) < minValue)
                minValue = data.get(i);
        }
        return minValue;
    }

    static Integer getMax(List<Integer> data) {
        if (data.size() == 0)
            return null;
        Integer maxValue = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) > maxValue)
                maxValue = data.get(i);
        }
        return maxValue;
    }

    static Double getMedium(List<Integer> data) {
        if (data.size() == 0)
            return null;
        if (data.size() == 1)
            return Double.valueOf(data.get(0));
        Double summ = Double.valueOf(getSumm(data));
        Double midVal = summ / data.size();
        // return (Double)( (minVal + maxVal) / data.size());
        return midVal;
    }

    static Integer getSumm(List<Integer> data) {
        if (data.size() == 0)
            return null;
        Integer summ = 0;
        for (int i = 0; i < data.size(); i++) {
            summ += data.get(i);
        }
        return summ;
    }
}
