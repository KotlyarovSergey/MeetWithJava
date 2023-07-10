// 3. * В калькулятор добавьте возможность отменить последнюю операцию.

package Practice_04_0407.HW;

import java.util.Scanner;
import java.util.Stack;

public class hw_03 {
    static Stack<String> operationStack;
    static Scanner scanner;

    public static void main(String[] args) {
        operationStack = new Stack<>();
        scanner = new Scanner(System.in);
        mainLoop();
        scanner.close();
    }

    static void mainLoop() {
        String input;
        System.out.println("Введите выражение или 'z' для отмены операции или 'q' для выхода:");
        while (true) {
            // String input = getData().trim();
            input = scanner.nextLine().trim();
            if (input.equals("z")) {
                // отменяем операцию
                if (!operationStack.empty()) {
                    System.out.println(perplexity());
                    System.out.println(operationStack.pop());
                }else{
                    System.out.println("\tСписок пуст");
                }
            } else if (input.equals("q")) {
                // выходим
                break;
            } else {
                // вычисляем
                String[] parsedStrings = parser(input);
                if (parsedStrings == null) {
                    System.out.println("\tОшибка ввода!");
                    // return;
                } else {

                    double calcResult = calculate(parsedStrings);
                    String operation = parsedStrings[0] + " " + parsedStrings[1] + " " + parsedStrings[2] + " = "
                            + calcResult;
                    System.out.println(operation);
                    operationStack.add(operation);
                    // System.out.println(operationStack);
                }
                
            }
            System.out.println("Введите выражение:");
        }
    }

    // static String getData() {
    // System.out.println("Введите выражение или 'z' для отмены операции или 'q' для
    // выхода:");
    // // Scanner scanner = new Scanner(System.in);
    // String result = scanner.nextLine();
    // // scanner.close();
    // return result;
    // }

    static Double calculate(String[] data) {
        Double num1 = Double.parseDouble(data[0]);
        Double num2 = Double.parseDouble(data[2]);
        switch (data[1].charAt(0)) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                return num1 / num2;
        }
        return null;
    }

    static String[] parser(String userData) {
        userData = userData.trim();
        int dataLength = userData.length();
        // String[] result = new String[3];
        int[] position = new int[] { 0 };

        // 1. первое число
        String fitstNumber = parseNumber(userData, position);
        if (fitstNumber.length() == 0 || position[0] > dataLength - 2)
            // if(fitstNumber.length() == 0)
            return null;

        // 2. знак
        String mathSign = parseMathSign(userData, position);
        if (mathSign.length() != 1 || position[0] > dataLength - 1)
            return null;

        // 3. второе число
        String secondNumber = parseNumber(userData, position);
        if (secondNumber.length() == 0)
            return null;

        // System.out.println(fitstNumber + " " + mathSign + " " + secondNumber );
        return new String[] { fitstNumber, mathSign, secondNumber };
    }

    static String parseNumber(String data, int[] startPosition) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        int i = startPosition[0];
        while (i < data.length()) {
            char symb = data.charAt(i);
            if (Character.isDigit(symb) || symb == '.')
                sb.append(symb);
            else
                break;
            i++;
        }
        result = sb.toString();

        // количество и положение точек
        int idx = result.indexOf('.');
        if (idx > -1) {
            if (idx == 0 || idx == result.length() - 1) {
                return "";
            }
            if (result.indexOf('.', idx + 1) > idx) {
                return "";
            }
        }
        startPosition[0] = i; // меняем индекс
        return result;
    }

    static String parseMathSign(String data, int[] startPosition) {
        Character ch = data.charAt(startPosition[0]);
        startPosition[0]++;
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
                return ch.toString();
            default:
                return "";
        }
    }

    static String perplexity(){
        return "\n\t!!!  Что отменять-то? Как отменить, если оно уже вычислено?!!! \nЯ не знаю. По этому просто вывожу предыдущую операцию:";
    }

}
