package lesson8.b5;

public class ArrayAver {
    /*
    Вычисление среднего значения элементов массива: Напишите метод на Java, который принимает массив целых чисел и
    возвращает их среднее значение. Если массив пуст, метод должен возвращать 0. Например, для массива [1, 2, 3, 4, 5]
     среднее значение будет 3.
     */

    public static int findSumStream(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
    public static double findAverageStream(int[] array) {
        int sum = findSumStream(array);
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] r = {1, 2, 3, 4, 5};
        double result = findAverageStream(r);
        System.out.println("Среднее значение: " + result);
    }
}
