package ВторойСеминар;

public class task1 {
    public static void main(String[] args) {
        int n = 10;
        char c1 = '1';
        char c2 = '2';

System.out.println(concat(c1, c2, n));
    }

    static String concat(char c1, char c2, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
        sb.append(c1);
        sb.append(c2);
        }
        return sb.toString();
    }
}
