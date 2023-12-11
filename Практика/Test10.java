package Практика;

public class Test10 {
    public static void main(String[] args) {
        Human h1 = new Human("bob", 30);//Варьируя методы Human можно задавать разные параметры на вход
        Human h2 = new Human("Tom", 12);
        //h1.setName("Vova");
        //Human.description = "Nice";//Статические переменные можно использовать и вызывать через класс,
        // она является общей для всех
        // Human.getDescription();
        //h1.getAll();
        //human1.description = "Bad";// так вообще нельзя, но в принципе можно, но не стоит
        //h2.getAll();
        Human h3 = new Human("rob", 4);
        
        h1.printNumPeople();
        h2.printNumPeople();
        h3.printNumPeople();

        //Math.pow(2, 4);//2 в 4

    }
}
class Human{
    private String name;
    private int age;

    private static int countPeople;
    public static String description;

    // public Human(){
    //     this.name = "Имя по умолчянию";
    //     this.age = 0;
                
    // }

    // public Human(String name){//перегрузка метода для 2х методов
    //     System.out.println("Привет из 2 конструтора");
    //     this.name = name;
    // }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        //System.out.println("Привет из 3 конструктора");
        countPeople++;
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

    // public static void getDescription(){
    //     System.out.println(description);
    // }

    public void getAll(){
        System.out.println(name+" "+ age +" "+description);
    }

    // public static void printAll(){
    //     System.out.println(name);//нельзя обращаться к name т.к.
    // она является переменной объекта у которого переменная name каждая индивидуальной,
    //     // а name статически
    // }
        public void printNumPeople(){
            System.out.println(countPeople);
        }

}

