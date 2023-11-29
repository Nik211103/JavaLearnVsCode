/**
 * program
 */
import java.util.Scanner;
public class program {
    
    // public static void main(String[] args) {
    //     String s = "  2";
    //     System.out.println(s);
    // }

    // public static void main(String[] args) {
    //     int age = 8;
    //     short salary = 12;

    //     System.out.println(age);
    //     System.out.println(salary);


    //     float f = 123.45f;
    //     double a = 123.45;

    //     System.out.println(f);
    //     System.out.println(a);

    //     boolean flag1 = true && false;
    //     boolean flag2 = true || false;

    //     boolean flag3 = flag1 ^ flag2;

    //     System.out.println(flag1);
    //     System.out.println(flag2);
    //     System.out.println(flag3); 

    // public static void main(String[] args) {
    //     var i = 123;
    //     System.out.println(i);
    //     int a = 123;
    //     a++;
    //     System.out.println(a);
    //     System.out.println(++a);//можно так
    // }

        // public static void main(String[] args) {
            
        //     int[] arr = new int[10];
        //     arr[3] = 13;
        //     arr = new int[] {1, 2, 3, 4, 5};
        //     System.out.println(arr[3]);
        //     System.out.println(arr.length);
        //     //Есть понятия явное и неявное преобразование

        // }
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("name: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s!", name);
            iScanner.close();

        }
}
    