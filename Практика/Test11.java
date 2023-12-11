package Практика;

public class Test11 {
    public static void main(String[] args) {
        new Test(20);
        final int X = 10;//невозможно изменить ее значение
        System.out.println(X);
    }
}
class Test{
    public final int CONST; //public static final int CONST; делается для делимости между всеми, иначе переполнение

    public Test(int CONST){
        this.CONST = CONST;
    }

    // public void setCONST(int x){ так не получится т.к.
    //     this.CONST = x; переменная константа
    // }
}
