package Stepik_courses.Chapter_2_Basic_syntax;// created 21.01.2021
//        Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один
//        отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
//        Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
//        он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
//        Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
//        К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
//        добавит проверяющая система.
//
//        Пример
//        Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на
//        выходе должен получиться массив {0, 1, 2, 2, 3}


import java.util.Arrays;

public class T_09_mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {-300, 400, 0, 2, 2, 552};
        int[] arr2 = {1, 3, 100, 0, -17, 34};
//        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));

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

//    public static int[] mergeArrays(int[] a1, int[] a2) {
//        int[] consolidatedArray = new int[a1.length + a2.length];
//        for (int i = 0; i < a1.length; i++) {
//            consolidatedArray[i] = a1[i];
//        }
//        for (int j = a1.length, k = 0; j < a1.length + a2.length; j++, k++) {
//            consolidatedArray[j] = a2[k];
//        }

//        Arrays.sort(consolidatedArray);

//        int temp;
//        for (int i = 0; i < consolidatedArray.length; i++) {
//            for (int j = 0; j < consolidatedArray.length; j++) {
//                if (consolidatedArray[i] < consolidatedArray[j]) {
//                    temp = consolidatedArray[i];
//                    consolidatedArray[i] = consolidatedArray[j];
//                    consolidatedArray[j] = temp;
//                }
//            }
//        }

//        int temp;
//        int i = 0;
//        int j = 0;
//
//        while(i < consolidatedArray.length) {
//            while (j < consolidatedArray.length) {
//                if (consolidatedArray[i] < consolidatedArray[j]) {
//                    temp = consolidatedArray[i];
//                    consolidatedArray[i] = consolidatedArray[j];
//                    consolidatedArray[j] = temp;
//                    j++;
//                }
//                i++;
//            }
//        }
//        return consolidatedArray;
//    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int[] consolidateArray = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            consolidateArray[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            consolidateArray[i + a1.length] = a2[i];
        }

        quickSort(consolidateArray, 0, consolidateArray.length - 1);
        return consolidateArray;
    }

    private static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int middleIndex = separate(arr, from, to);
            quickSort(arr, from, middleIndex - 1);
            quickSort(arr, middleIndex, to);
        }
    }

    private static int separate(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int middleIndex = arr[from];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < middleIndex) {
                leftIndex++;
            }
            while (arr[rightIndex] > middleIndex) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int temp = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
