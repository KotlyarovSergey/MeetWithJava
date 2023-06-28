// 4*. К калькулятору из предыдущего дз добавить логирование.

package Practice_02_2706.HW;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hw02_Task4 {
    static Logger logger = Logger.getLogger(hw02_Task4.class.getName());
    static final String MYFOLDER = "Practice_02_2706\\HW\\";

    public static void main(String[] args) {
        setLogger();
        String input = getData();
        String[] parsedStrings = parser(input);
        if (parsedStrings == null) {
            logger.log(Level.WARNING, String.format("Parse error.  input: \'%s\'", input));
            System.out.print("Ошибка ввода!");
            return;
        }

        double result = calculate(parsedStrings);
        System.out.println(parsedStrings[0] + " " + parsedStrings[1] + " " + parsedStrings[2] + " = " + result);

    }

    static String getData() {
        System.out.print("Введите выражение:  ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }

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

    static void setLogger() {
        try {
            FileHandler fileHandler = new FileHandler(MYFOLDER + "calculator.log");
            logger.addHandler(fileHandler);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fileHandler.setFormatter(sFormatter);
        } catch (Exception e) {
            logger.log(Level.INFO, "e.getMessage()");
        }
    }
}
