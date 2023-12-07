package Практика;

public class Test5 {
    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.setName("Какое-то имя");
        person1.setAge(12);
        System.out.println("Выводим значение " +person1.getName());
        System.out.println("Выводим значение " +person1.getAge());
        
    }
}


class Person { // У класса могуть быть: 1. Данные(поля); 2. Действия, которые он может совершать (методы)
    private String name;
    private int age;


    public void setName(String userName){
        name = userName;
    }
    public String getName(){
       return name;
    }

    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge(){
       return age;
    }
    

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
