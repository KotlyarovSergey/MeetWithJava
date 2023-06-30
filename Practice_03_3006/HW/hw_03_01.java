// Реализовать алгоритм сортировки слиянием

package Practice_03_3006.HW;

import java.util.Arrays;

public class hw_03_01 {
    public static void main(String[] args) {
        int[] array = new int[] { 71, 13, 52, 38, 64, 19, 27, 91, 40, 87 };
        for (int i : array) System.out.print(i + " ");
        System.out.println();

        sort(array);
        for (int i : array) System.out.print(i + " ");
        System.out.println();
    }

    static void sort(int[] array) {
        if (array.length == 1)
            return;

        // разделить на 2 куска и отправить на сортировку
        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOf(array, mid);
        sort(leftArray);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);
        sort(rightArray);

        // из отсуртированных кусков собрать отсортированный массив
        int i = 0;
        int j = 0;
        int k = 0;
        // берем попарно из обоих кусков, сравниваем, меньшее записываем в основной массив
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                k++;
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }

        // дописываем остатки
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            k++;
            i++;
        }
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            k++;
            j++;
        }
    }

}
