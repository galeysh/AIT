package lesson7.b3;

public class Main {
    public static void main(String[] args) {

        int A = 1000;
        int B = 500;
        int rabatt = 100;

        int sum = A + B - rabatt;

        System.out.println("Стоимость суммы А + В со скидкой равно " + sum + " руб");
        System.out.println("Сумма скидки от этой покупки равна " + rabatt + " руб");
    }
}
