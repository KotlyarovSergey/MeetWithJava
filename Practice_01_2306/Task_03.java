// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

package Practice_01_2306;

public class Task_03 {
    public static void main(String[] args) {
        // int[] array = new int[] { 3, 1, 3, 2, 2, 3, 3, 3 };
        int[] array = new int[] { 3, 1, 3, 2, 3, 3, 2, 3 };
        // int[] array = new int[] { 3, 3, 3, 3, 1, 3, 3, 3 };
        // sort(array, 3);
        sort2(array, 3);
        // sortFor(array, 3);
        // sortWhile(array, 3);
        
        System.out.println("result:");
        print(array);
    }

    static void sort(int[] array, int value) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            while (array[rightIndex] == value) {
                rightIndex--;
            }
            while (array[leftIndex] != value && leftIndex < rightIndex) {
                leftIndex++;
            }
            if (array[leftIndex] == value) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
            }
        }
    }

    static void sort2(int[] array, int value) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            while (array[rightIndex] == value) {
                rightIndex--;
            }
            while (leftIndex < rightIndex) {
                if(array[leftIndex] != value)
                    leftIndex++;
                else{
                    swap(array, leftIndex, rightIndex);
                    leftIndex++;
                    break;
                }
            }
        }
    }

    static void sortFor(int[] array, int value) {   // тоже фигня!!!!
        int lastItem = array.length - 1;
        for (int i = lastItem; i >= 0; i--) {
            if (array[i] == value) {
                swap(array, i, lastItem--);
                print(array);
                // lastItem--;
            }
        }
    }

    static void sortWhile(int[] array, int value){  // фигня!!!!!
        print(array);
        int lftIdx = 0;
        int rghtIdx = array.length - 1;
        while (lftIdx < rghtIdx) {
            if (array[lftIdx] == value) {
                array[lftIdx] = array[rghtIdx];
                array[rghtIdx] = value;
                rghtIdx--;
                print(array);
            } else {
                lftIdx++;
            }
        }
    }

    static void swap(int[] array, int index1, int index2) {
        System.out.println(index1 + " " + index2);
        print(array);
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        
    }

    static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}