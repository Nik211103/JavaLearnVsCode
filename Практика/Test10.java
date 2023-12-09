package Практика;

public class Test10 {
    public static void main(String[] args) {
        Human human1 = new Human();
        
    }
}
class Human{
    private String name;
    private int age;

    public Human(){
        this.name = "Имя по умолчянию";
        this.age = 0;
        
    }

    // public Human(String name){//перегрузка метода для 2х методов
    //     System.out.println("Привет из 2 конструтора");
    //     this.name = name;
    // }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Привет из 3 конструктора");
    }


    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }


     public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name + " "+ age);
    }
}
