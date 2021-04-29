// created 16.02.2021
package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;

import java.util.Arrays;

public class T_09_EfficientSortedAlgorithms {
    public static void main(String[] args) {

//        int[] array = new int [100000];
        int[] array = {5, 4, 3, 2, 1};
        int[] array1 = {5, 4, 3, 2, 1};
        int startIndex = 0;
        int endIndex = array.length - 1;

        int randomArrayLength = 100000;
        int[] randomArray = new int[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            randomArray[i] = (int) Math.floor(Math.random() * 10000);
        }

        int[] randomArray1 = new int[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            randomArray1[i] = (int) Math.floor(Math.random() * 10000);
        }

        int[] randomArray2 = new int[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            randomArray2[i] = (int) Math.floor(Math.random() * 10000);
        }


        long startTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(quickSort(randomArray, 0, randomArray.length-1)));
        System.out.println(Arrays.toString(bubbleSort22(randomArray)));
        long endTime = System.currentTimeMillis();
        System.out.println("Perfomance sort " + (endTime - startTime));

//        System.out.println(Arrays.toString(bubbleSortMyMethod(randomArray)));
//        System.out.println(Arrays.toString(bubbleSort(randomArray1)));
//        System.out.println(Arrays.toString(shellSort(new int [100000])));


//        long startTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(quickSort(randomArray2, 0, randomArray2.length - 1)));
//        long endTime = System.currentTimeMillis();
//        System.out.println("Perfomance quickSort " + (endTime - startTime));

//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(quickSort(array, startIndex, endIndex)));
    }

    //todo perfomance 26s
    public static int[] bubbleSortVersion1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //todo perfomance 2-3s
    public static int[] bubbleSortVersion2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int rightNumber = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = array[j];
                if (leftNumber > rightNumber) {
                    array[j + 1] = leftNumber;
                    array[j] = rightNumber;
                } else {
                    break;
                }
            }
        }
        return array;
    }


    //todo perfomance 9-10s
    public static int[] bubbleSort11(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //todo perfomance 26-30s
    public static int[] bubbleSort22(int[] array) {
        boolean isContinue = true;
        while (isContinue) {
            isContinue = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isContinue = true;
                }
            }
        }

        return array;
    }


    //todo perfomance 80-120ms
    public static int[] quickSort(int array[], int from, int to) {
        if (from < to) {
            int pivotIndex = splitArray(array, from, to);
            quickSort(array, from, pivotIndex - 1);
            quickSort(array, pivotIndex, to);
        }
        return array;
    }

    public static int splitArray(int array[], int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivotIndex = array[from + (to - from) / 2];

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivotIndex) {
                leftIndex++;
            }
            while (array[rightIndex] > pivotIndex) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

}
