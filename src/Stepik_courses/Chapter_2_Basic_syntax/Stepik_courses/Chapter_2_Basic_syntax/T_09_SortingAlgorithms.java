package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 22.01.2021


import java.util.Arrays;

public class T_09_SortingAlgorithms {
    public static void main(String[] args) {

//        int[] array = new int [100000];
        int[] array = {5,4,3,2,024};
        int[] array1 = {5,4,3,2,1};
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
        System.out.println(Arrays.toString(bubbleSort(randomArray)));
        long endTime = System.currentTimeMillis();
        System.out.println("Perfomance quickSort " + (endTime - startTime));

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

//todo it very strange works...
    public static int[] bubbleSortMyMethod(int[] array) {
        long startTime = System.currentTimeMillis();

        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Perfomance bubbleSortMyMethod " + (endTime - startTime));

        return array;
    }

//todo array 100_000 sorted in 26-32s
    public static int[] bubbleSortVersion1(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
//                System.out.println(i + " ");
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
//                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    //todo array 100_000 sorted in 19-23s
    public static int[] bubbleSortVersion2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
//                System.out.println(i + " ");
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
//                    System.out.println(Arrays.toString(array));
                }
            }
        }

        return array;
    }

    //todo array 100_000 sorted in 2-2,5s
    public static int[] bubbleSortVersion3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int rightNumber = array[i];
            for (int j = i - 1; j >= 0 ; j--) {
                int leftNumber = array[j];
                if(leftNumber > rightNumber){
                    array[j + 1] = leftNumber;
                    array[j] = rightNumber;
                } else {
                    break;
                };
            }
        }
        return array;
    }

//todo array 100_000 sorted in 26s
    public static int[] bubbleSort(int[] array) {
        long startTime = System.currentTimeMillis();

        int temp;
        boolean isNeedSorted = false;
        while (!isNeedSorted) {
            isNeedSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isNeedSorted = false;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Perfomance bubbleSort " + (endTime - startTime));

        return array;
    }


//    public static int[] shellSort(int[] array) {
//
//        Instant start = Instant.now();
//
//        int gap = array.length/2;
//
//        int temp;
//        while (gap >=1){
//            for (int right = 0; right < array.length; right++) {
//                for (int i = right - gap; i >= 0; i-=gap) {
//                    if(array[i]> array[i+gap]){
//                        temp = array[i+gap];
//                        array[i+gap] = array[i];
//                        array[i] = temp;
//                    }
//                }
//            }
//            gap = gap/2;
//        }
//
//        Instant end = Instant.now();
//        System.out.println(Duration.between(start, end).getSeconds());
//
//        return array;
//    }

    public static int[] quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int middleElement = separate(arr, from, to);
            quickSort(arr, from, middleElement - 1);
            quickSort(arr, middleElement, to);
        }
        return arr;
    }

    public static int separate(int[] arr, int from, int to) {
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
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
