package ПервыйСеминар;

public class test3 {
    // public static void main(String[] args) {
    //     int number = 10;
    //     int [] numbers = new int[5];
    //     System.out.println(numbers[0]);
    //     numbers[0] = 10; 
    //     System.out.println(numbers[0]);
    //     for (int i = 0; i < numbers.length; i++) {
    //         numbers[i] = i * 10;
    //     }
        
    //     for (int i = 0; i < numbers.length; i++) {
    //         System.out.print(numbers[i]+" ");
    //     }
    //     System.out.println();
    //     int [] numbers1 = {1, 2, 3};
    //     for (int i = 0; i < numbers1.length; i++) {
    //         System.out.print(numbers1[i]+" ");
    //     }
    //}
    // public static void main(String[] args) {
    //     String [] str = new String[3];
    //     str[0] = "Hello";
    //     str[1] = "Bye";
    //     str[2] = "Java";
        
    //     for (int i = 0; i < str.length; i++) {
    //         System.out.println(str[i]);
    //     }

    //     for (String string : str) {
    //         System.out.println(string);
    //     }

        
    //     int num[] = {1,2,3};
    //     int sum = 0;
    //     for (int x: num) {
    //         sum = sum + x;
    //     }
    //     System.out.println(sum);

    //     int value = 0;
    //     String s = null;
    //     System.out.println(s);
    // }
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};  //1 2 3
                                                        //4 5 6
                                                        //7 8 9
        //System.out.println(matrix[2][2]);//Первое число отвечает за строки(групу в {}), а второе за столбец(внутри группы{{}})
        //System.out.println(matrix[1][0]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {// Matrix[i]обязательно не забыть
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String [][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
    }
}
