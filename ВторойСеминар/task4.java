package ВторойСеминар;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
public class Task4 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String filePath = "ВторойСеминар/test.txt";//надо в конце добавить название и формат файла
        String s = "TEST";
        int n = 100;
        String res = repeat(s, n);
        writeInFile(res, filePath);
        readFile(filePath);
        
    }

    static void writeInFile(String res, String filePath){
        
        FileHandler handler = null;
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);

        try {
            handler = new FileHandler("ВторойСеминар/log.txt", true);
            logger.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter writer = new FileWriter(filePath, true);){ // в круглых скобочках нужно добавить обработку, чтобы файл закрылся
            writer.write(res); // если в строчку выше в скобочках добавить true то файл будет не перезаписываться
            // а дописываться в одну строчку
            writer.write("\n"); // для переноса на новую строчку
            logger.info("Запись прошла успешна");
            } 
        catch (Exception e) {
            e.printStackTrace();
            logger.warning("Запись в файл не удалась");
        }
        handler.close();
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
