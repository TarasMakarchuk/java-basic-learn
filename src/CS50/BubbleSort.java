// created 17.10.2020
package CS50;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[] {-100,30,55, 789, 1000999, -5, -15};
        bubbleSort(array);
    }

    static void bubbleSort(int[] args) {
        int tempMax;
        int tempMin;
        for (int j = 0; j < args.length - 1; j++) {
            for (int i = 0; i < args.length; i++) {
                if ((i + 1) < args.length) {
                    if (args[i] > args[i + 1]) {
                        tempMax = args[i];
                        tempMin = args[i + 1];
                        args[i + 1] = tempMax;
                        args[i] = tempMin;
                    }
                }
            }

            System.out.println(Arrays.toString(args));
        }
    }
}
