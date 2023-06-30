// Задание №2.1
// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков

// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

// Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон.
package Practice_03_3006;

import java.util.List;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;

public class Task_02 {
    public static void main(String[] args) {
        // String[] strArray = new String[]{"d","b","ds"};
        // List<String> planets = Arrays.asList(strArray);
        
        List<String> planets = new ArrayList<>();
        planets.add("Венера");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Венера");
        planets.add("Уран");
        planets.add("Уран");
        System.out.println(planets);

        Collections.sort(planets);
        System.out.println(planets);
        int count = 1;
        String planet = planets.get(0);
        for(int i =1; i < planets.size(); i++){
            String curPlan = planets.get(i);
            if(curPlan.equals(planet)){
                count++;
            } else{
                System.out.println(planet + ": " + count);
                count = 1;
                planet = curPlan;
            }
        }
        System.out.println(planet + ": " + count);


        // удалить повторяющиеся элементы.
        planet = planets.get(0);
        for(int i = 1; i < planets.size(); ){
            String curPlan = planets.get(i);
            if(curPlan.equals(planet)){
                planets.remove(i);
            } else{
                planet = curPlan;
                i++;
            }
        }
        System.out.println(planets);

    }
}
