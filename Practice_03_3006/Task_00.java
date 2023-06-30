// Даны следующие строки, cравнить их с помощью == и
// метода equals() класса Object
// 📌 String s1 = "hello";
// 📌 String s2 = "hello";
// 📌 String s3 = s1;
// 📌 String s4 = "h" + "e" + "l" + "l" + "o";
// 📌 String s5 = new String("hello");
// 📌 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


package Practice_03_3006;

public class Task_00 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        if(s1 == s2){
            System.out.println("s1 = s2");
        }else{
            System.out.println("s1 != s2");
        }

        if(s1 == s3){
            System.out.println("s1 = s3");
        }else{
            System.out.println("s1 != s3");
        }

        if(s1 == s4){
            System.out.println("s1 = s4");
        }else{
            System.out.println("s1 != s4");
        }

        if(s1 == s5){
            System.out.println("s1 = s5");
        }
        else{
            System.out.println("s1 != s5");
        }

        
        if(s1 == s6){
            System.out.println("s1 = s6");
        }
        else{
            System.out.println("s1 != s6");
        }

        if(s1.equals(s5)){
            System.out.println("s1 equals s5");
        }
        else{
            System.out.println("s1 != s5");
        }

        if(s1.compareTo(s6)==0){
            System.out.println("s1 compare s6");
        }
        else{
            System.out.println("s1 != s6");
        }
         ;

        
    }
}
