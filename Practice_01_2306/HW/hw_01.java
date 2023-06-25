// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Practice_01_2306.HW;
public class hw_01 {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Triangle %d = %d\n", n, triangle(n));
        System.out.printf("Factorial %d = %d\n", n, factorial(n));

        n = -5;
        System.out.println(triangle(n));
        System.out.println(factorial(n));
    }

    static int triangle(int n) {
        if (n < 0)
            throw new ArithmeticException();
        int result = 0;
        for (int i = 1; i <= n; i++)
            result += i;
        return result;
    }

    static int factorial(int n) {
        if (n < 0)
            throw new ArithmeticException();
        if (n < 2)
            return 1;
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

}
