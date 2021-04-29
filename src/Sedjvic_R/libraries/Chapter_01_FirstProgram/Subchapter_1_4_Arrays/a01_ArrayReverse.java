// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//обратная перестановка элементов массива

import java.util.Arrays;

public class a01_ArrayReverse {
    public static void main(String[] args) {
    int [] array = {5,4,3,2,1};
        int n = array.length;

        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }

        System.out.println(Arrays.toString(array));

        int maxElement = 0;
        for (int i = 1; i < array.length; i++) {
            maxElement = Math.max(array[i], array[i-1]);
        }

        System.out.println("max element " + maxElement);
    }
}
