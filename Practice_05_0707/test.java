package Practice_05_0707;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Число");
        int n = scanner.nextInt();
        n = Integer.parseInt(scanner.nextLine());

        System.out.println("name");
        scanner.nextLine(); 
        String name = scanner.nextLine();
        
        System.out.println("Surname");
        String sName = scanner.nextLine();

        // System.out.println("name");
        // name = scanner.nextLine();
        System.out.println(name);
    }
}
