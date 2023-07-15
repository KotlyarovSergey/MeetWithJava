package Practice_05_0707.HW;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Map;

// Пусть дан список сотрудников:Иван Иванов, Пётр Петров и др.
// Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

public class hw_05_02 {
    public static void main(String[] args) {
        LinkedList<String> employes = employesList();
        System.out.println(employes);

        HashMap<String, Integer> counMap = counting(employes);
        TreeMap<Integer, String> treeMap = toTreeMap(counMap);

        System.out.println(treeMap);
    }

    static HashMap<String, Integer> counting(LinkedList<String> employes){
        HashMap<String, Integer> list = new HashMap<>();
        for (String string : employes) {
            String[] arr = string.split(" ");
            String name =arr[0];
            if(list.containsKey(name)){
                int n = list.get(name);
                list.put(name, ++n);
            }else{
                list.put(name, 1);
            }
        }

        
        
        return list;
    }

    private static TreeMap<Integer, String> toTreeMap(HashMap<String, Integer> list) {
        TreeMap<Integer, String> result = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if(entry.getValue() > 1){
                result.put(entry.getValue(), entry.getKey());
            }
        }
        return result;
    }
    
    static LinkedList<String> employesList(){
        LinkedList<String> employes = new LinkedList<>();

        employes.add("Иван Иванов");
        employes.add("Петр Петров");
        employes.add("Иван Семенов");
        employes.add("Сергей Антипов");
        employes.add("Иван Серов");
        employes.add("Петр Вожжов");
        employes.add("Сергей Антонов");
        employes.add("Сергей Загонов");
        employes.add("Сергей Газонов");
        employes.add("Афанасий Миронов");
        return employes;
    }

}
