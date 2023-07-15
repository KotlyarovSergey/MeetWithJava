package Practice_06_1107;

import java.util.HashSet;

import javax.xml.crypto.Data;

// Задание №2
// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
// приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

public class Task_2 {
    public static void main(String[] args) {
        
    }
}

/**
 * Cat
 */
class Cat_clinic {
    String ownerName; // имя владельца
    String catName; // имя кота
    String breed; // порода кота
    int ageCat; // возвраст кота
    double weight; // вес кота
    boolean gender; // пол кота
    HashSet <String> disease; // список болезней
    HashSet <String> vacctinations; // список прививок
    Data data;

     
    //public Cat (){}
    // запись на прийом
    // вывести данные по болезням кота
    // получить информацио о владельце
    // добавить информацию по новому прийому


}
 class Cat_exhibition{
    String ownerName; // имя владельца
    String breed; // порода кота
    int ageCat; // возвраст кота
    double weight; // вес кота
    boolean gender; // пол кота
    String catName; // имя кота
    String [] achievs; // награды
    String nameMather; // имя мамы кота
    String nameFather; // имя отца кота

    // вывести имя владельца, 
    // вывести породу кота, имя
    // вывести параметры кота (вес, возвраст, пол)
    // вывести награды кота
    // добавить награду
    // вывести список наград
    // посмотреть родословную

}
class Cat_theatre{
    String catName; // имя кота
    String breed; // порода кота
    int ageCat; // возвраст кота
    double weight; // вес кота
    boolean gender; // пол кота
    String [] skils; //способности кота
    String [] perfomance; // номера в которых участвует кот
    Data [] dataPerfomance; // даты выступлений
    

    // вывести карту данных кота
    // добавить новую дату выступления
    // добавить новый номер
    // получить расписание выступлений
    // задать вес кота
    
}