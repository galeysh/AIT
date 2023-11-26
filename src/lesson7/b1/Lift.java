package lesson7.b1;

import java.util.Scanner;

public class Lift {

    /*
    Сломанный лифт лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
    Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт
    превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов,
    которые понадобятся лифту.
    Пример: Ввод: H = 200, N = 50, M = 1 Ответ: 5 Объяснение: Первый подьем: 50 - 1 = 49
    Второй подьем: 49 + 50 - 1 = 98 Третий подьем: 98 + 50 - 1 = 147 Четвертый подьем: 147 + 50 - 1 = 196
    Пятый подьем: выйти за пределы H.
    реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
     */

    public static int numberOfLifts(int floor, int stepUp, int stepDown){

        int cFloor = 1;
        int liftC = 0;

        while (cFloor <= floor) {
            liftC++;
            cFloor += stepUp;

            if (cFloor > floor) {
                break;
            }

            cFloor -= stepDown;

        }

        return liftC;

    }



    public static void main(String[] args){

        int H;
        int N;
        int M;

        Scanner scanner = new Scanner(System.in);
        System.out.println("H = ");
        H=scanner.nextInt();

        System.out.println("N = ");
        N=scanner.nextInt();

        System.out.println("M = ");
        M=scanner.nextInt();


        int result = numberOfLifts(H, N, M);
        System.out.println("Количество подъемов: " + result);
    }



}
