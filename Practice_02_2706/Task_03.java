// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package Practice_02_2706;
public class Task_03 {
    public static void main(String[] args) {
        String str = "Шалаш";
        if(IsPalindrom(str)) System.out.println(str + " - это палиндром");
        else System.out.println(str + " - это не палиндром");
    }

    public static boolean IsPalindrom(String input) {
        input = input.toUpperCase();
        int len =input.length(); 
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i)!=input.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
