// Задание №0
// 📌 Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// 📌 Вывести данные по сотрудникам с фамилией Иванов.

package Practice_05_0707;

import java.util.HashMap;
import java.util.Map;

public class Task_0 {
    public static void main(String[] args) {
        Map<String, String> employes = new HashMap<>();
        employes.put("123456", "Иванов");
        employes.put("321456", "Васильев");
        employes.put("234561", "Петрова");
        employes.put("234432", "Иванов");
        employes.put("654321", "Петрова");
        employes.put("345678", "Иванов");

        String name = "Иванов";
        for (Map.Entry<String, String> entry : employes.entrySet()) {
            if(entry.getValue().equals(name)){
                System.out.println("Номер " + entry.getKey() + " Фамилья " + entry.getValue());
            }
        }
    }
}
