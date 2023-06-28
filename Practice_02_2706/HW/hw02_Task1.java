// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//      если я правильно понял задачу, рузультат должен быть таким:
// select * from students where name="Ivanov" AND country="Russia" AND city="Moscow"

package Practice_02_2706.HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class hw02_Task1 {
    public static void main(String[] args) {
        String startQuery = "select * from students";
        String jsonFile = "Practice_02_2706\\HW\\task1.json";
        String filter = readFile(jsonFile);

        String[][] allItems = parseJson(filter);

        String appEnd = makeAppend(allItems);

        String fullQuery;
        if (appEnd.length() > 0)
            fullQuery = startQuery + " where " + appEnd;
        else
            fullQuery = startQuery;

        System.out.println(fullQuery);

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

    static String[][] parseJson(String data) {
        // 1. отбрасываем {}
        String base = getBase(data);

        // 2. разбераем по элеметам
        String[] items = getItems(base);

        // 3. формируем массив
        String[][] result = new String[items.length][2];
        int i = 0;
        for (String string : items) {
            result[i] = getKeyValue(string);
            i++;
        }

        return result;
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

    static String getBase(String jsonSting) {
        int begin = jsonSting.indexOf('{');
        int end = jsonSting.indexOf('}');
        if (begin == -1 || end == -1)
            return "";
        return jsonSting.substring(begin + 1, end).trim();
    }

    static String[] getItems(String base) {
        char delimiter = ',';
        int count = countOf(base, delimiter);
        String[] items = new String[count + 1];
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < base.length(); i++) {
            if (base.charAt(i) == delimiter) {
                items[index] = sb.toString().trim();
                index++;
                sb.setLength(0);
            } else {
                sb.append(base.charAt(i));
            }
        }
        items[index] = sb.toString().trim();
        return items;
    }

    static String[] getKeyValue(String item) {
        String[] result = new String[2];
        char delimiter = ':';
        int delimPos = item.indexOf(delimiter);

        // key
        String temp = item.substring(0, delimPos).trim();
        int begin = temp.indexOf('\"');
        int end = temp.indexOf('\"', begin + 1);
        if (begin == -1 || end == -1) {
            result[0] = temp;
        } else {
            result[0] = temp.substring(begin + 1, end);
        }

        // value
        result[1] = item.substring(delimPos + 1);

        return result;
    }

    static String makeAppend(String[][] data) {
        int rows = data.length;
        StringBuilder result = new StringBuilder();

        // надо проверить на null с первого элемента
        int i = 0;
        while (result.length() == 0 && i < rows) {
            if (data[i][1].compareTo("\"null\"") != 0) {
                result.append(data[i][0]);
                result.append("=");
                result.append(data[i][1]);
            }
            i++;
        }

        // и перебирать остальное
        for (int j = i; j < rows; j++) {
            if (data[j][1].compareTo("\"null\"") != 0) {
                result.append(" AND ");
                result.append(data[j][0]);
                result.append("=");
                result.append(data[j][1]);
            }
        }
       
        return result.toString();
    }

}
