package lesson8.b1;

import java.util.Arrays;

public class Main {

    /*
    Перевернуть массив: Создайте метод, который принимает массив целых чисел и возвращает его в перевернутом порядке.
     Например, если входной массив [1, 2, 3, 4], то результат должен быть [4, 3, 2, 1].
     */

    static void reverse (int[] a, int n) {

        int[] m = new int[n];
        int j = n;

        for (int i =0; i < n; i++) {
            m[j-1] = a[i];
            j = j - 1;
        }
        System.out.println("Перевернутый массив: ");
        for (int k = 0; k < n; k++) {
            System.out.println(m[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4, 5};
        reverse(arr, arr.length);
    }

}
