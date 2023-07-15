package Practice_05_0707;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Задание №2
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class Task_2 {
    public static void main(String[] args) {
        String[] examples = new String[] { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>",
                "{a+]}{(d*3)}" };
        for (String example : examples) {
            System.out.printf("%s -> %s\n", example, checkBrace(example));
        }

    }

    static boolean checkBrace(String expression) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> braces = new HashMap<Character, Character>();
        braces.put('(', ')');
        braces.put('[', ']');
        braces.put('{', '}');
        braces.put('<', '>');
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (braces.containsKey(symbol)) {
                stack.add(symbol);
            } else if (braces.containsValue(symbol)) {
                if (stack.isEmpty())
                    return false;
                if (!braces.get(stack.pop()).equals(symbol)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
