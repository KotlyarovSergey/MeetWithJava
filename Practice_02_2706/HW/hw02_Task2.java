// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
// запишите в лог-файл.

package Practice_02_2706.HW;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hw02_Task2 {
    static Logger logger = Logger.getLogger(hw02_Task2.class.getName());
    static final String MYFOLDER = "Practice_02_2706\\HW\\";
    public static void main(String[] args) {
        setLogger();
        int[] array = new int[]{3, 4, 9, 7, 8, 2, 5, 1};
        System.out.println(arrayToString(array));
        sort(array);
        System.out.println(arrayToString(array));
    }

    static void setLogger(){
        try{
            FileHandler fileHandler = new FileHandler(MYFOLDER + "task02.log");
            logger.addHandler(fileHandler);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fileHandler.setFormatter(sFormatter);
        }
        catch(Exception e){
            logger.log(Level.INFO, "e.getMessage()");
        }
    }

    static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
            logger.log(Level.INFO, arrayToString(array));
            // logger.info(arrayToString(array));   //  !! пишет тоже самое
        }
    }

    static String arrayToString(int[] array){
        if(array.length == 0) return "[ ]";

        StringBuilder sBuilder = new StringBuilder("[");
        sBuilder.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sBuilder.append(", ");
            sBuilder.append(array[i]);
        }
        sBuilder.append("]");
        return sBuilder.toString();
    }


}
