//2) Вывести все простые числа от 1 до 1000

package Practice_01_2306.HW;
public class hw_02 {
    public static void main(String[] args) {
        System.out.print("1");
        for (int i = 2; i <= 100; i++) {
            if (isSimple(i))
                System.out.print(", " + i);
        }
    }

    static boolean isSimple(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
