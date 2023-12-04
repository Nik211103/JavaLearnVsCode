package Практика;

public class Test4 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        
        //System.out.println("Меня зовут " + person1.name +" "+"мне "+person1.age+" лет." );
        
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        //System.out.println("Меня зовут " + person2.name +" "+"мне "+person2.age+" лет." );
        person2.speak();
        
    }
}


class Person { // У класса могуть быть: 1. Данные(поля); 2. Действия, которые он модет совершать (методы)
    String name;
    int age;

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
