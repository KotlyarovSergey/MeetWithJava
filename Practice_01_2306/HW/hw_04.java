// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package Practice_01_2306.HW;

public class hw_04 {
    public static void main(String[] args) {
        // format: ax + yb = cd
        String input = "2? + ?5 = 69";
        System.out.printf("%s -> %s\n", input, caclulate(input));

        input = "2? + ?4 = 43";
        System.out.printf("%s -> %s\n", input, caclulate(input));

        input = "5? + ?4 = 60";
        System.out.printf("%s -> %s\n", input, caclulate(input));

        input = "5? + ?4 = 43";
        System.out.printf("%s -> %s\n", input, caclulate(input));
    }

    static String caclulate(String input) {

        int a = Integer.parseInt(String.valueOf(input.charAt(0)));
        int b = Integer.parseInt(String.valueOf(input.charAt(6)));
        int c = Integer.parseInt(String.valueOf(input.charAt(10)));
        int d = Integer.parseInt(String.valueOf(input.charAt(11)));

        int x = d - b;
        if (x < 0) {
            x += 10;
            c -= 1;
        }
        int y = c - a;
        if (y < 0) {
            return "Нет решений";
        }

        // System.out.printf("%s%s + %s%s = %s%s", a, x, y, b, c, d);
        // return String.format("%s%s + %s%s = %s%s", a, x, y, b, c, d);
        return String.format("%s%s + %s%s = %s", a, x, y, b, (a + y) * 10 + x + b);
    }
}
