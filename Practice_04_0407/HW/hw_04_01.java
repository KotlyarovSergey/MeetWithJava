// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package Practice_04_0407.HW;

import java.util.LinkedList;

public class hw_04_01 {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        lList.add(10);
        lList.add(20);
        lList.add(30);
        lList.add(40);

        System.out.printf("Original: %s\n", lList);
        System.out.printf("Reverse: %s\n", reverse(lList));
    }   
    
    static LinkedList<Integer> reverse (LinkedList<Integer> inputList){
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (Integer item : inputList) {
            reverseList.add(0, item);
        }
        return reverseList;
    }
}
