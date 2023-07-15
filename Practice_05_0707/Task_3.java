package Practice_05_0707;

import java.util.HashMap;
import java.util.Map;

// Задание №3
// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

public class Task_3 {
    public static void main(String[] args) {
        String data = "MMXXII";
        System.out.println(arabicDigit(data));
    }

    static Map<Character, Integer> romanToArabic(){
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        return dict;
    }

    static int arabicDigit(String str){
        int result = 0;
        Map<Character,Integer> arabDigit = romanToArabic();
        for (char symbol : str.toCharArray()) {
            result += arabDigit.get(symbol);
        }
        return result;
    }
}
