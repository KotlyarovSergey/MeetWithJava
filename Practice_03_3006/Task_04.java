// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

package Practice_03_3006;

import java.util.ArrayList;
import java.util.List;

public class Task_04 {
    public static void main(String[] args) {
        List<ArrayList<String>> library = new ArrayList<>();
        ArrayList<String> genre1 = new ArrayList<>();
        ArrayList<String> genre2 = new ArrayList<>();
        ArrayList<String> genre3 = new ArrayList<>();
        genre1.add("проза");
        genre1.add("Воина и мир");
        genre1.add("12 стульев");
        genre1.add("Тарас Бульба");
        library.add(genre1);

        genre2.add("позия");
        genre2.add("Евгений Онегин");
        genre2.add("Бородино");
        genre2.add("Белая береза");
        library.add(genre2);

        genre3.add("детектив");
        genre3.add("Убийство в восточном экспрессе");
        genre3.add("Шерлок Холмс");
        library.add(genre3);

        System.out.println(library);

    }
}
