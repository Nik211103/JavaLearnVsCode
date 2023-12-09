package Практика;

public class Test9 {
    public static void main(String[] args) {
        Animal cat = new Animal("Barsic", 5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        
    }

}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name; //для того чтобы не создавать новые переменные
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    
}
