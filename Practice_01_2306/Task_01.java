package Practice_01_2306;
// В консоли запросить имя пользователя. В зависимости от

// текущего времени, вывести приветствие вида
// 📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// 📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// 📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// 📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.util.Calendar;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        String name = getName();
        getGreeting(name);
    }

    static String getName() {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    static void getGreeting(String name) {
        Calendar now = Calendar.getInstance(); // текущая дата
        int hour = now.get(Calendar.HOUR_OF_DAY); // час
        hour = 13;
        if (hour == 23 && hour < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        } else if (hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour < 18) {
            System.out.println("Доброе день, " + name + "!");
        } else {
            System.out.println("Доброе вечер, " + name + "!");
        }

    }
}
