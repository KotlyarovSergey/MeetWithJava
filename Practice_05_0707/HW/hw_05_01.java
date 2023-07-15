package Practice_05_0707.HW;

import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
// человек может иметь несколько телефонов.

public class hw_05_01 {
    static HashMap<String, HashMap<String, String>> phoneBook;

    public static void main(String[] args) {
        phoneBook = new HashMap<>();

        edit("Иванов Иван", "мобильный", "+792812312312");
        edit("Иванов Сергей", "домашний", "+786359123456");
        edit("Петров А.", "мобильный", "+792845645645");
        edit("Иванов Сергей", "мобильный", "+792832132132");
        edit("Смирнов", "мобильный", "+792845645645");
        print();
        System.out.println();
        
        deleteContact("Петров А.");
        deleteNumber("Иванов Сергей", "+792832132132");
        print();
    }

    static void edit(String name, String type, String number) {
        HashMap<String, String> phone;
        if (phoneBook.containsKey(name)) {
            // edit
            phone = phoneBook.get(name);
        } else {
            // add
            phone = new HashMap<>();
        }
        phone.put(type, number);
        phoneBook.put(name, phone);
    }

    static void deleteContact(String name){
        phoneBook.remove(name);
    }

    static void deleteNumber(String name, String number){
        if(phoneBook.containsKey(name)){
            HashMap<String,String> hashMap = phoneBook.get(name);
            if(hashMap.containsValue(number)){
                String type = "";
                for (Map.Entry<String, String> phone : hashMap.entrySet()) {
                    if(phone.getValue().equals(number)){
                        type = phone.getKey();
                    }
                }
                hashMap.remove(type);
            }
        }
    }

    static void print() {
        StringBuilder sBuilder = new StringBuilder();
        for (Map.Entry<String, HashMap<String, String>> entry : phoneBook.entrySet()) {
            sBuilder.append(entry.getKey());
            sBuilder.append(" [");
            
            HashMap<String,String> hashMap = entry.getValue();
            for (Map.Entry<String, String> phone : hashMap.entrySet()) {
                sBuilder.append(phone.getKey());
                sBuilder.append(": ");
                sBuilder.append(phone.getValue());
                sBuilder.append(" ");
            }
            sBuilder.append("]\n");
        }
        System.out.print(sBuilder.toString());
    }
}
