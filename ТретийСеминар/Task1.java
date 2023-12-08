package ТретийСеминар;

// import java.net.Socket;
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Random;

public class Task1 {
    // public static void main(String[] args) {
    //     List <Integer> list = new ArrayList<>();
    //     int a = 5;
    //     String s = "Привет";
    //     //int[] ссылочный тип данных
    //     //int простой
 
    //     System.out.println(list);
    //     System.out.println(a);
    //     System.out.println(s);

    // }

    // static void test(List<Integer> list, int a, String s){//ссылка на список 
    //     a++;
    //     list.add(a);
    //     s = "Пока";
    // }






//     Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
    // public static void main(String[] args) {
    //     int num = 10;
    //     int min = 0;
    //     int max = 10;
    //     List<Integer> userList = createlist(num, min, max);
    //     System.out.println(userList);
    //     userList.sort(null);//Comparator.reverseOrder для сортировки в обратном порядке
    //     System.out.println(userList);
    // }

    // static List<Integer> createlist(int num, int min, int max){
    //     List<Integer> realist = new ArrayList<>();
    //     Random random = new Random();
    //     for (int i = 0; i < num; i++) {
    //        int temp = random.nextInt(min, max + 1); 
    //        realist.add(temp);
    //     }
    //     return realist;
    // }
        



    // public static void main(String[] args) {
    //     List<Object> list = new ArrayList<>();

    //     list.add(1);
    //     list.add(2);
    //     list.add("kujgb");
    //     list.add('c');
    //     list.add(null);
    //     list.add(3.1444);
    //     System.out.println(list);
    //     // Iterator<Object> iterator = list.listIterator();
    //     // while (iterator.hasNext()){
    //     //     if (iterator.next() instanceof Integer){
    //     //         iterator.remove();
    //     //     }
    //     // }
    //     list.removeIf(x -> x instanceof Integer);

    //     System.out.println(list);
    // }


    // Каталог товаров книжного магазина сохранен в виде двумерного
    // списка List<ArrayList<String>> так, что на 0й позиции каждого
    // внутреннего списка содержится название жанра, а на остальных
    // позициях - названия книг. Напишите метод для заполнения данной
    // структуры.
    // public static void main(String[] args) {
    //     List<List<String>> catalog = new ArrayList<>();
    //     addBook(catalog, "adventure", "LOTR");
    //     addBook(catalog, "roman", "Master and Margorita");
    //     addBook(catalog, "politic", "Gosydari");
    //     System.out.println(catalog);
    // }
    // static void addBook(List<List<String>> catalog, String genre, String name){
    //     for (int i = 0; i < catalog.size(); i++) {
    //         List<String> inneCatolog = new ArrayList<>();

    //         if (catalog.get(i).get(0).equals(genre)){
    //             inneCatolog.add(name);
    //             return;
    //         }
    //     }
    //         List<String> newInneCatolog = new ArrayList<>();
    //         newInneCatolog.add(genre);
    //         newInneCatolog.add(name);
    //         catalog.add(newInneCatolog);
    // }
}
