// created 29.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.1. Напишите программу, которая читает целые числа (столько, сколько введет
//пользователь) из стандартного ввода и выводит максимальное и минимальное
//значение.

import Sedjvic_R.libraries.StdOut;

public class a14_MaxMinInt {
    public static void main(String[] args) {
        String str = "";
        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            str += n + " ";
        }

        String[] strArr = str.split(" ");
        int[] numbersArray = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numbersArray[i] = Integer.parseInt(strArr[i]);
        }

        int min = numbersArray[0];
        int max = min;
        for (int i = 1; i < numbersArray.length; i++) {
            if(min > numbersArray[i]){
                min = numbersArray[i];
            }
            if(max < numbersArray[i]){
                max = numbersArray[i];
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}
