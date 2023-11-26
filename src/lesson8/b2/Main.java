package lesson8.b2;

import java.util.Arrays;

public class Main {

    public static boolean areAllElemUnique(int[]arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
