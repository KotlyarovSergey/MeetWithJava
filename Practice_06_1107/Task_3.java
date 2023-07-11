package Practice_06_1107;

// Задание №3
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько
// экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

class Cat {
    String catName; // имя кота
    int ageCat; // возвраст кота
    String color; // цвет кота

    public Cat(String catName, int ageCat, String color) {
        this.catName = catName;
        this.ageCat = ageCat;
        this.color = color;
    }

    public String getName(){
        return catName;
    }

    public int getAge(){
        return ageCat;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Имя: " + catName + ", возраст: " + ageCat + ", цвет: " + color;
    }
}

public class Task_3 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3, "серый");
        Cat cat2 = new Cat("Муся", 2, "белый");
        System.out.println(cat1);
        System.out.println(cat2);
    }

}
