// Задание №3
// 📌 Создать список типа ArrayList<String>.
// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа.


package Practice_03_3006;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Task_03 {
    public static void main(String[] args) {
        // List<String> list1 = Arrays.asList("a", "b", "c", "d", "1", "2", "3");
        // List<String> list1 = Arrays.asList("asd", "3", "et", "235", "sdf");
        List<String> list1 = new ArrayList<>();
        list1.add("null");
        list1.add("33");
        list1.add("12");
        list1.add("asdf");
        removeDigits(list1);
        System.out.println(list1);
    }

    static void removeDigits(List<String> dataList){
        for(int i = 0; i < dataList.size(); i++){
            // if((Object)(dataList.get(i)) instanceof Integer){
            if(tryParseInteger(dataList.get(i))){
                // System.out.println(i);
                dataList.remove(i);
                i--;
            }
        }
        // System.out.println(dataList);
        // return dataList;
    }

    static boolean tryParseInteger(String str){
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
