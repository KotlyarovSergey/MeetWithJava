// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

package Practice_04_0407;
import java.util.LinkedList;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку вида text~num или введите esc для выхода из программы: ");
        String str = iScanner.nextLine();
        System.out.println(splitUserText(str, iScanner));
        iScanner.close();
    }
    private static LinkedList <String> splitUserText(String str, Scanner iScanner){
        LinkedList <String> result = new LinkedList<>();
        
        while (!str.equalsIgnoreCase("esc")) {
            String [] tempArray = str.split("~");
            int num = Integer.parseInt(tempArray[1]);
            if (num>result.size()) {
                System.out.println("Несуществующая позиция");
            }
            else if (tempArray[0].equalsIgnoreCase("print")) {
                System.out.println(result.get(num));
                result.remove(num);
                System.out.println(result.size());
            } else {
                result.add(num, tempArray[0]);
                System.out.println(result.size());
            }
            System.out.println("Введите строку вида text~num или введите esc для выхода: ");
            str = iScanner.nextLine();
        }        
        return result;
    }
}
