// created 08.02.2021
package Stepik_courses.Chapter_2_Basic_syntax;

import java.util.Arrays;

public class T_09_mergeArrays_1 {
    public static void main(String[] args) {
        int[] arr1 = {400, -300, 2, 5};
        int[] arr2 = {1, 3, 100, 0, -17};

        int randomArrayLength = 100000;
        int[] randomArray = new int[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            randomArray[i] = (int) Math.floor(Math.random() * 10000);
        }

        int[] randomArray1 = new int[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            randomArray1[i] = (int) Math.floor(Math.random() * 10000);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(mergeArrays(randomArray, randomArray1)));
        long endTime = System.currentTimeMillis();
        System.out.println("In main perfomance bubbleSortMyMethod " + (endTime - startTime));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] consolidatedArray = new int[a1.length + a2.length];
        int[] tempArr = {1, 2, 3};
//        long startTime = System.currentTimeMillis();
//
        int temp1; //ShellSorting
        for (int step = a1.length / 2; step > 0; step = step / 2) {
            for (int i = step; i < a1.length; i++) {
                for (int j = i - step; j >= 0 && a1[j] > a1[j + step]; j = j - step) {
                    temp1 = a1[j];
                    a1[j] = a1[j + step];
                    a1[j + step] = temp1;
                }
            }
        }
//
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("Perfomance bubbleSortMyMethod " + (endTime - startTime));
//
//        long startTime1 = System.currentTimeMillis();
//
//
        int temp2; //ShellSorting
        for (int step = a2.length / 2; step > 0; step = step / 2) {
            for (int i = step; i < a2.length; i++) {
                for (int j = i - step; j >= 0 && a2[j] > a2[j + step]; j = j - step) {
                    temp2 = a2[j];
                    a2[j] = a2[j + step];
                    a2[j + step] = temp2;
                }
            }
        }
//
//
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("Perfomance bubbleSortMyMethod " + (endTime1 - startTime1));

//        long startTime2 = System.currentTimeMillis();
//
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < consolidatedArray.length; i++) {
            if (index1 < a1.length && (index2 >= a2.length || a1[index1] < a2[index2])) {
                consolidatedArray[i] = a1[index1];
                index1++;
            } else {
                consolidatedArray[i] = a2[index2];
                index2++;
            }
        }
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Perfomance bubbleSortMyMethod " + (endTime2 - startTime2));
//
        return consolidatedArray;

    }
}
