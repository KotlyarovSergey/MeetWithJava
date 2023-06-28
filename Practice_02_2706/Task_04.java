// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

package Practice_02_2706;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task_04 {
    static final String FOLDER = "Practice_02_2706\\";
    public static void main(String[] args) {
        int n = 100;
        String text = "TEST";
        String fname = FOLDER + "out.txt";     

        String ourData = getData(n, text);
        writeFile(fname, ourData);
    }

    static String getData(int n, String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb.append(str);
        }
        return sb.toString();
    }

    static void writeFile(String fileName, String data){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
