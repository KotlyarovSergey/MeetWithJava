// 3.** Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"
// Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент
// [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Practice_02_2706.HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class hw02_Task3 {
    public static void main(String[] args) {
        String jsonFile = "Practice_02_2706\\HW\\task3.json";
        String jsonLine = readFile(jsonFile);
        String[] items = getItems(jsonLine);

        for (String string : items) {
            // System.out.println(string);
            String[] values = getValues(string);
            System.out.printf("Студент %s получил %s по предмету %s.\n", values[0], values[1], values[2]);
        }

    }

    static String readFile(String file) {
        String result = "";
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(file));
            result = bReader.readLine();
            bReader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    static String[] getItems(String jsonArray) {
        // всё, что в {} считаем item'ом
        int itmCount = countOf(jsonArray, '{');
        String[] items = new String[itmCount];
        int index = 0;
        StringBuilder sbBuilder = new StringBuilder();
        boolean record = false;
        for (int i = 0; i < jsonArray.length(); i++) {
            char ch = jsonArray.charAt(i);
            if (ch == '{') {
                record = true;
            } else if (ch == '}') {
                record = false;
                items[index] = sbBuilder.toString();
                sbBuilder.setLength(0);
                index++;
            } else if (record) {
                sbBuilder.append(ch);
            }
        }
        return items;
    }

    static int countOf(String str, char symbol) {
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == symbol)
                count++;
            i++;
        }
        return count;
    }

    static String[] getValues(String line) {
        String[] result = new String[3];
        StringBuilder sBuilder = new StringBuilder();
        boolean record = false;
        int index = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            // System.out.printf("ch= %s, i= %s\n", ch, i);
            if (ch == ':') {
                record = true;
                i++;
            } else if (ch == '\"' && record) {
                // System.out.println(sBuilder.toString());
                record = false;
                result[index] = sBuilder.toString();
                sBuilder.setLength(0);
                index++;
            } else if (record) {
                sBuilder.append(ch);
            }
        }
        return result;
    }


}
