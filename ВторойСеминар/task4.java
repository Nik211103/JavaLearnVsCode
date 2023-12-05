package ВторойСеминар;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
public class task4 {
    public static void main(String[] args) {
        String filePath = "ВторойСеминар/test.txt";//надо в конце добавить название и формат файла
        String s = "TEST";
        int n = 100;
        String res = repeat(s, n);
        writeInFile(res, filePath);
        readFile(filePath);
        
    }

    static void writeInFile(String res, String filePath){
        
        try(FileWriter writer = new FileWriter(filePath, true);){ // в круглых скобочках нужно добавить обработку, чтобы файл закрылся
            writer.write(res); // если в строчку выше в скобочках добавить true то файл будет не перезаписываться
            // а дописываться в одну строчку
            writer.write("\n"); // для переноса на новую строчку
            } 
        catch (Exception e) {
            e.printStackTrace();//инструкция что делать если не сработает
        }
    }

    static void readFile(String filePath){
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)){
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    static String repeat(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
