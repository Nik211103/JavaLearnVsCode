// package Практика;

// public class Test4 {
//     public static void main(String[] args) {
//         Person person1 = new Person();
//         person1.setNameAndAge("Роман", 20);
        
//         String s1 = "Вова";
//         // person1.sayHello();
//         //int year1 = person1.calculate();
//         person1.speak();
        
//         //System.out.println("Меня зовут " + person1.name +" "+"мне "+person1.age+" лет." );
        
//         Person person2 = new Person();
//         person2.calculate();
//         person2.name = "Вова";
//         //int year2 =  person2.age = 20;
//         //System.out.println("Меня зовут " + person2.name +" "+"мне "+person2.age+" лет." );
//         // person2.speak();
//         person2.setNameAndAge(s1, 30);
//         person1.speak();
//         person2.speak();
        
//     }
// }


// class Person { // У класса могуть быть: 1. Данные(поля); 2. Действия, которые он может совершать (методы)
//     String name;
//     int age;

//     int calculate(){
//         int years = 65 - age;
//         return years;
//     }

//     void setNameAndAge(String username, int userage){
//         name = username;
//         age =userage;
//     }

//     void speak(){
//         for (int i = 0; i < 3; i++) {
//             System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
//         }
//     }
//     void sayHello(){
//         System.out.println("Hello");
//     }
// }
