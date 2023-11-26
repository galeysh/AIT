package lesson8.b4;

import java.util.Arrays;

public class Main {

    /*
    Определение диапазона чисел в массиве: Разработайте программу на Java, которая анализирует массив целых чисел и
    определяет разницу между наибольшим и наименьшим значениями. Например, для массива [3, 7, 2, 9, 4] программа
    должна сообщить, что разница между максимальным (9) и минимальным (2) значениями равна 7.
     */

    public static void main(String[] args) {

        int[] array = {3, 7, 2, 9, 4};
        int r = calcul(array);
        System.out.println("Разница между макс и мин значениями: " + r);
    }

    public static  int calcul(int[] array){
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        return max - min;
    }
}
