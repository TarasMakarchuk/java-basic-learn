// created 12.02.2021
package Stepik_courses.Chapter_2_Basic_syntax;

import java.util.Arrays;

public class T_09_mergeArrays_QuickSort_2 {
    public static void main(String[] args) {

        int arraySize = 100_000;
        int[] a1 = new int[arraySize];
        int[] a2 = new int[arraySize];


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};

        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * i * 100);
//            a1[i] = i;
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (int) (Math.random() * i);
//            a2[i] = i + arraySize;
        }
//
//        long startTime = System.currentTimeMillis();
//
//        mergeArrays(a1, a2);
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("In main perfomance bubbleSortMyMethod " + (endTime - startTime));

        long startTime1 = System.currentTimeMillis();

        quickSort(a1, 0, a1.length-1);
        System.out.println(Arrays.toString(a1));

        long endTime1 = System.currentTimeMillis();
        System.out.println("In main perfomance bubbleSortMyMethod " + (endTime1 - startTime1));
    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] array3 = new int[a1.length + a2.length];
        int[] tempArray = {1, 2, 3};
        System.arraycopy(a1, 0, array3, 0, a1.length);
        System.arraycopy(a2, 0, array3, a1.length, a2.length);

        boolean isSorted = true;
        for (int i = 1; i < array3.length; i++) {
            if (array3[i - 1] > array3[i]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("in if " + isSorted);
//            System.out.println(Arrays.toString(array3));
            return array3;
        } else {
            System.out.println("in else " + isSorted);
            quickSort(array3, 0, array3.length - 1);
//            System.out.println(Arrays.toString(array3));
            return array3;
        }
    }


    private static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int pivotIndex = splitIntoParts(array, from, to);
            quickSort(array, from, pivotIndex - 1);
            quickSort(array, pivotIndex, to);
        }
    }

    private static int splitIntoParts(int[] array, int from, int to) {
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

    public static int[] myBubbleSort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("arr[i] " + array[i] + " arr[j] " + array[j]);
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }


        System.out.println(Arrays.toString(array));
        return array;
    }


}
