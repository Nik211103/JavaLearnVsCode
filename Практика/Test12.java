package Практика;

public class Test12 {
    public static void main(String[] args) {
        // String x = "Hello";
        // x.toUpperCase();//HELLO
        // x = x.toUpperCase();//новый объект
        // System.out.println();


        // String s1 = "Hello";
        // String s2 = " my";
        // String s3 = " friend";
        // String all = s1+s2+s3;//после сложения создается новый объкта s1 и s2 удаляются
        // System.out.println(all);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");//можно цепочкой
        System.out.println(sb.toString());
        System.out.printf("This is a string, %s", " NICE %d", 123);//форматирование строки %d цифры, %f float
        System.out.println();
        System.out.printf("%f %s %d qwerty qwerty", 12.3,"r",2);
        System.out.println();
        System.out.printf("String %d \n",532);
        System.out.printf("String %10d \n",532332);
        System.out.printf("String %-10d \n",2);//корректиовка отступов
    }
}
