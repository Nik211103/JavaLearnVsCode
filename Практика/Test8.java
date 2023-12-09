package Практика;

import java.util.Scanner;

// // Создайте класс Person с приватными переменными name (тип String) и age (тип int). 
// // Добавьте методы getName() и setName(), а также getAge() и setAge() для доступа к этим переменным.

// public class Test8 {
//     public static void main(String[] args) {
//         Person person1 = new Person();

//         person1.setAge(24);
//         person1.setName("Viktor");

//         System.out.println("Меня зовут "+person1.getName()+" и мне "+person1.getAge()+" лет.");
//     }
// }

// class Person{
//     private String name;
//     private int age;

//     public void setName(String username){
//         name = username;
//     }
//     public String getName(){
//         return name;
//     }

//     public void setAge(int userage){
//         age = userage;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// Создайте класс Car с приватными переменными brand (тип String) и model (тип String). 
// Добавьте методы getBrand() и setBrand(), а также getModel() и setModel() для доступа к этим переменным.
// public class Test8 {
//     public static void main(String[] args) {
//         Car bibika = new Car();
//         bibika.setBrand("Porche");
//         bibika.setModel("GTC-120");

//         System.out.println("Самая быстрая машина: " + bibika.getBrand()+  " " + bibika.getModel());
//     }
// }

// class Car{
//     private String brand;
//     private String model;

//     public void setBrand(String userbrand){
//         brand = userbrand;
//     }
//     public String getBrand(){
//         return brand;
//     }

//     public void setModel(String usermodel){
//         model = usermodel;
//     }
//     public String getModel(){
//         return model;
//     }

    
// }

// Создайте класс "Банковский счет" с приватными полями баланс и владелец.
// Реализуйте методы getBalance() и getOwner(), которые возвращают соответствующие значения. 
// Добавьте метод deposit(), который позволяет вносить средства на счет, и метод withdraw(),
// который позволяет снимать деньги со счета. 
// Учтите проверку на доступные средства перед снятием.
public class Test8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Здравствуйте, выберете операцию");
            System.out.println("1.Снятие денег");
            System.out.println("2.Пополнение баланса");


            
            BankAccount account1 = new BankAccount();
            account1.setOwner("Vova");
            account1.setBalance(12.12);


            short useranswer = scanner.nextShort();
            if(useranswer == 1){
                BankAccount.withdraw(account1.getBalance());
            }
            else if (useranswer == 2)
            {
                BankAccount.deposit(account1.getBalance(), scanner);
            }
        }

        
    }

    
}

class BankAccount{
    Scanner scanner = new Scanner(System.in);
    private Double balance;
    private String owner;

    

    public void setBalance(Double ownerBalance){
        balance = ownerBalance;
    }
    public Double getBalance(){
        return balance;
    }

    public void setOwner(String loginOwner){
        owner = loginOwner;
    }
    public String getOwner(){
        return owner;
    }


    static void withdraw(double balance){
        System.out.print("Введите желаемую сумму для снятия:");
        try (Scanner scanner = new Scanner(System.in)) {
            double numWithdraw = scanner.nextDouble();

            if(balance != 0 && numWithdraw <= balance){
                balance -= numWithdraw;
                System.out.println("Выполнена снятие на сумму: "+numWithdraw+ ". Ваш оставшийся баланс: " + balance);
            }
            else{
                System.out.println("Невозможно выполнить операцию. Ваш баланс равен 0 или введена сумма большая вашего баланса.");
            }
        }
        
    }

    static void deposit(double balance, Scanner scanner){
        System.out.print("Введите желаемую сумму для пополнения баланса: ");
        double numDeposit = scanner.nextDouble();
        if(numDeposit > 0 ){
            balance += numDeposit;
            System.out.println("Выполненно пополнение на сумму: "+numDeposit+ ". Текущий баланс равен: "+balance);
        }
        else{
            System.out.println("Невозможно выполнить операцию. Сумма пополнения должна быть больше нуля.");
        }
        
    }
}

/*
  TODO 

2.Обработка ошибок пользовательского ввода: В вашем коде нет обработки некорректного пользовательского ввода. 
Рекомендуется добавить проверки и обработку исключений для предотвращения сбоев программы при некорректных данных, 
например, при вводе отрицательных значений или неправильного формата чисел.

3.Использование геттеров и сеттеров: Вместо прямого доступа к приватным полям balance и owner, 
рекомендуется использовать геттеры и сеттеры для обеспечения инкапсуляции данных. 
Это поможет контролировать доступ к полям и добавить дополнительную логику при необходимости.

4.Возвращаемое значение метода deposit(): Метод deposit() возвращает void, однако, 
может быть полезно возвращать обновленное значение баланса после пополнения. 
Рассмотрите возможность изменить тип возвращаемого значения на double или возвращать объект BankAccount, 
чтобы упростить дальнейшую обработку.

5.Использование форматированного вывода: Для улучшения читаемости и точности вывода рекомендуется использовать 
форматированный вывод, например, с помощью класса DecimalFormat. 
Это позволит управлять количеством десятичных знаков и форматом чисел при выводе баланса.
 */


 /*
    ADDITIONAL TASK(доп.задания)
 
 2.Создайте класс "Заказ" с приватными полями номер, дата и сумма. 
 Реализуйте методы getNumber(), getDate() и getAmount(), которые возвращают соответствующие значения. 
 Добавьте метод calculateDiscount(), который вычисляет скидку на основе суммы заказа. 
 Также добавьте метод confirmOrder(), который подтверждает заказ.

3.Создайте класс "Пользователь" с приватными полями имя, возраст и электронная почта. 
Реализуйте методы getName(), getAge() и getEmail(), которые возвращают соответствующие значения. 
Добавьте метод sendEmail(), который отправляет электронное письмо пользователю, и метод changePassword(), 
который позволяет пользователю изменить пароль.

4.Создайте класс "Товар" с приватными полями название, цена и количество. 
Реализуйте методы getName(), getPrice() и getQuantity(), которые возвращают соответствующие значения. 
Добавьте методы increaseQuantity() и decreaseQuantity(), которые позволяют увеличивать и уменьшать количество товара.

5.Создайте класс "Рабочий" с приватными полями имя, зарплата и часы работы. 
Реализуйте методы getName(), getSalary() и getWorkingHours(), которые возвращают соответствующие значения. 
Добавьте методы calculateSalary(), который вычисляет зарплату на основе отработанных часов, и updateWorkingHours(), 
который позволяет обновлять количество отработанных часов. */
