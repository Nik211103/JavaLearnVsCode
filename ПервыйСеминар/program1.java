package ПервыйСеминар;
import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 5, 3};
        int val = 3;
        System.out.println(Arrays.toString(Sort(arr, val)));
    }
    static int[] Sort(int[] arr , int num) {
        int[] sortArr = new int[arr.length];
        int countVal = arr.length - 1;
        int countNum = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (arr[i] == num) {
                sortArr[countVal] = num;
                countVal--;
            } else {
                sortArr[countNum] = arr[i];
                countNum++;
            }
        }
        return sortArr;
    }
}
