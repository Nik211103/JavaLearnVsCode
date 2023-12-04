package ПервыйСеминар;
//Создайте программу для конвертации температуры из градусов Цельсия в градусы Фаренгейта и наоборот. 
//Пользователь должен ввести исходную температуру и выбрать нужную конвертацию.

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите температуру: ");
        double temp = scanner.nextInt();
        System.out.println("Введите 1 для перевода из Цельсия в Фаренгейты или 2 для перевода наоборот: ");
        short op = scanner.nextShort();
        double result = 0;

        System.out.println("Результат = " + (operation(result, temp, op)));
        
    }
        
        static double operation(double result, double temp, short op){

            if(op == 1 || op == 2){
                if(op == 1){
                    result = (temp * 9.0/5.0) + 32;
                }
                else if(op == 2){
                    result = 5.0/9.0 * (temp - 32);
                }
                
            } 
            else{
                System.out.println("Введен несуществующий номер операции!");
            }
            
            return result;
            
        }
    
        
}



