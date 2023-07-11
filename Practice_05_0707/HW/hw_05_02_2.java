package Practice_05_0707.HW;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Пусть дан список сотрудников:Иван Иванов, Пётр Петров и др.
// Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

public class hw_05_02_2 {
    public static void main(String[] args) {
        HashMap<String, String> employes = employesList();
        System.out.println(employes);

        HashMap<String, Integer> counMap = counting(employes);
        TreeMap<Integer, String> treeMap = toTreeMap(counMap);

        System.out.println(treeMap);
    }

    static HashMap<String, Integer> counting(HashMap<String, String> employes){
        HashMap<String, Integer> list = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : employes.entrySet()) {
            String name = entry.getValue();
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
    
    static HashMap<String, String> employesList(){
        HashMap <String, String> employes = new HashMap<>();
        
        employes.put("Иванов", "Иван");
        employes.put("Петров", "Петр");
        employes.put("Семенов", "Иван");
        employes.put("Антипов", "Сергей");
        employes.put("Серов", "Иван");
        employes.put("Вожжов", "Петр");
        employes.put("Антонов", "Сергей");
        employes.put("Загонов", "Сергей");
        employes.put("Газонов", "Сергей");
        employes.put("Миронов", "Афанасий");
        
        
            
        return employes;
    }

}
