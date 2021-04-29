// created 30.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.5. Напишите программу, которая читает из стандартного ввода последовательность
//целых чисел и выводит число, повторы которого образуют самую длинную
//непрерывную подпоследовательность, а также длину этой подпоследовательности.
//Например, для входной последовательности 1 2 2 1 5 1 1 7 7 7 7 1 1 программа
//должна выдать: «Longest run: 4 consecutive 7s».

import java.util.Arrays;

public class a18_SequenceOfInteger {
    public static void main(String[] args) {

        int[] sourceArr = {7,7,7,1,2,2,1,5,1,1,7,7,7,7,1,1,7,7,7,7};

        int[] countArr = new int[sourceArr.length];
        int[] numArr = new int[sourceArr.length];

        int arrLengthCounter = 0;
        int counter = 1;
        for (int i = 1; i < sourceArr.length; i++) {
            if (sourceArr[i - 1] == sourceArr[i]) {
                counter++;
                countArr[arrLengthCounter] = counter;
                numArr[i-1] = sourceArr[i - 1];
                arrLengthCounter++;
            } else {
                counter = 1;
            }
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(countArr));

        int maxCount = countArr[0];
        int requiredNumber = 0;
        for (int i = 1; i < countArr.length; i++) {
           if(maxCount <= countArr[i]){
               maxCount = countArr[i];
               requiredNumber = numArr[i];
           }
        }

        System.out.println("Longest run " + maxCount);
        System.out.println("consecutive " + requiredNumber);


    }
}
