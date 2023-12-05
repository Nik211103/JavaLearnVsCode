package ВторойСеминар;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
public class task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку: ");
            String string = scanner.nextLine();

            if (polindrom(string) == true){
            System.out.println("Строка является палиндромом");
   }
            else{
            System.out.println("Строка не является палиндромом");
            }
        }
    }
    
    static boolean polindrom(String string){
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString().equals(string);
    }

    
}
