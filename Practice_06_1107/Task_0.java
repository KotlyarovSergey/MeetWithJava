package Practice_06_1107;
// Задание №0
// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task_0 {
    public static void main(String[] args) {
        HashSet<Integer> set = getHSet();
        // for (Integer num : set) {
        //     System.out.print(num + " ");
        // }
        System.out.println(set);
        LinkedHashSet<Integer> lHashSet = getLinkedHashSet();
        System.out.println(lHashSet);

        System.out.println(getTreeSet());
    }

    private static HashSet<Integer> getHSet() {
        HashSet<Integer> hSet = new HashSet<>(Arrays.asList(34, 6, 3, 2, 9, 2, 6, 3, -5));
        // HashSet<Integer> hSet = new HashSet<>();
        // hSet.add(1);
        // hSet.add(2);
        return hSet;
    }

    private static LinkedHashSet<Integer> getLinkedHashSet(){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(34, 6, 3, 2, 9, 2, 6, 3,-5));
        return linkedHashSet;
    }

    private static TreeSet<Integer> getTreeSet(){
        return new TreeSet<>(Arrays.asList(34, 6, 3, 2, 9, 2, 6, 3, -5));
    }
}
