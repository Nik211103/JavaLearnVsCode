package ПервыйСеминар;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введите свой возраст: ");
                String age = scanner.nextLine();
                switch (age.toLowerCase()) {//оператор .toLowerCase МОЖЕТ НЕ ОБРАЩАТЬ НА РЕГИСТРЫ 
                    case "null":
                        System.out.println("Ты родился");
                        break;
                    case "seven":
                        System.out.println("Ты пошел в школу");
                        break;
                    case "18":
                        System.out.println("Ты закончил школу");
                        break;
                    default:
                        System.out.println("Неизвестный возраст");
                        break;
                }
            }
        }
    }
