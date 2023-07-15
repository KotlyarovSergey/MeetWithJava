package Practice_06_1107.HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class hw_06_01 {
    public static void main(String[] args) {

        HashSet<Notebook> allNotebooks = fillWareHouse("Practice_06_1107\\HW\\warehouse.scv");
        System.out.println("Всего " + allNotebooks.size() + " ноутбуков");

        HashSet<Notebook> filtredNotebooks = filtration(allNotebooks);

        System.out.println("Выбрано " + filtredNotebooks.size() + " ноутбуков");
        for (Notebook notebook : filtredNotebooks) {
            System.out.println(notebook);
        }

    }

    static HashSet<Notebook> filtration(HashSet<Notebook> allNotebooks) {
        HashMap<Integer, String> filterMap = makeFilterMap();
        printFileter(filterMap);
        HashMap<Integer, String> param = getFilterParameter(filterMap);
        // System.out.println(param);
        HashSet<Notebook> filtredNotebooks = new HashSet<>();

        for (Notebook note : allNotebooks) {
            if (check(note, param))
                filtredNotebooks.add(note);
        }

        return filtredNotebooks;
    }

    static boolean check(Notebook item, HashMap<Integer, String> param) {
        int num = 0;
        String kriteriy = "";
        for (Map.Entry<Integer, String> entry : param.entrySet()) {
            num = entry.getKey();
            kriteriy = entry.getValue();
            break;
        }

        switch (num) {
            case 1:
                try {
                    int ram = Integer.parseInt(kriteriy);
                    if (ram <= item.ram)
                        return true;
                } catch (Exception e) {
                    return false;
                }
                // break;
            case 2:
                try {
                    int hd = Integer.parseInt(kriteriy);
                    if (hd <= item.hdVolume)
                        return true;
                } catch (Exception e) {
                    return false;
                }
                // break;
            case 3:
                if (kriteriy.equals(item.os))
                    return true;
                // break;
            case 4:
                if (kriteriy.equals(item.color))
                    return true;
                break;
            case 5:
                try {
                    int hd = Integer.parseInt(kriteriy);
                    if (hd <= item.cpuCore) 
                        return true;
                } catch (Exception e) {
                    return false;
                }
                // break;
            case 6:
                try {
                    float diagonal = Float.parseFloat(kriteriy);
                    if(diagonal <= item.displaySize)
                        return true;
                } catch (Exception e) {
                    return false;
                }
                break;
            default:
                break;
        }
        return false;
    }

    static HashMap<Integer, String> getFilterParameter(HashMap<Integer, String> filterMap) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        String input = scanner.nextLine().trim();
        int n = 0;
        try {
            n = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            scanner.close();
            return null;
        }

        if (!filterMap.containsKey(n)) {
            System.out.println("Такой параметр отсутствует");
            scanner.close();
            return null;
        }

        System.out.println("Введите минимальныое значение:");
        input = scanner.nextLine().trim();
        scanner.close();

        HashMap<Integer, String> result = new HashMap<>();
        result.put(n, input);
        return result;
    }

    static HashMap<Integer, String> makeFilterMap() {
        HashMap<Integer, String> filter = new HashMap<>();
        filter.put(1, "Объем ОЗУ");
        filter.put(2, "Объем ЖД");
        filter.put(3, "Операционная система");
        filter.put(4, "Цвет");
        filter.put(5, "Количество ядер ЦПУ");
        filter.put(6, "Диагональ экрана");
        return filter;
    }

    static void printFileter(HashMap<Integer, String> filter) {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Введите цифру, соответствующую необходимому критерию:\n");
        for (Map.Entry<Integer, String> entery : filter.entrySet()) {
            sBuilder.append("\t");
            sBuilder.append(entery.getKey());
            sBuilder.append(" - ");
            sBuilder.append(entery.getValue());
            sBuilder.append("\n");
        }
        System.out.print(sBuilder.toString());

    }

    static HashSet<Notebook> fillWareHouse(String fileName) {
        HashSet<Notebook> all = new HashSet<>();
        String str;
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(fileName));
            str = bReader.readLine();
            while (str != null) {
                all.add(parse(str));
                // System.out.println(str);
                str = bReader.readLine();
            }
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return all;
    }

    static Notebook parse(String line) {
        Notebook notebook = new Notebook();
        String[] array = line.split("#");

        if (array.length != 12)
            return null;
        notebook.cast = 0;
        notebook.displaySize = 0;
        try {
            notebook.cast = Float.parseFloat(array[0]);
            notebook.displaySize = Float.parseFloat(array[1]);
            notebook.cpuCore = Integer.parseInt(array[6]);
            notebook.cpuClock = Float.parseFloat(array[7]);
            notebook.ram = Integer.parseInt(array[8]);
            notebook.hdVolume = Integer.parseInt(array[9]);
        } catch (NumberFormatException e) {
        }

        notebook.vendor = array[2];
        notebook.model = array[3];
        notebook.color = array[4];
        notebook.cpuName = array[5];
        notebook.video = array[10];
        notebook.os = array[11];

        return notebook;
    }
}
