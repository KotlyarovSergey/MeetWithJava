// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

package Practice_02_2706;

public class Task_01 {
    public static void main(String[] args) {
        
        
        // System.out.println(alteratingChars(5, 'A', 'B'));
        System.out.println(alteratingCharsForString(5, 'A', 'B'));
        
    }

    public static String alteratingChars(int n, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n / 2; i++){
            sb.append(c1);
            sb.append(c2);
        }
        if(n%2==1) sb.append(c1);
        return sb.toString();
    }

    public static String alteratingCharsForString(int n, char c1, char c2){
        String result = "";
        for(int i = 0; i < n / 2; i++){
            result+= String.valueOf(c1) + String.valueOf(c2) ;
        }
        if(n%2==1) result += String.valueOf(c1);
        return result;
    }
}
