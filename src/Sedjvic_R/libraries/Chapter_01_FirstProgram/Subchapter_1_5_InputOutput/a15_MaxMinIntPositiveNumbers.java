// created 29.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.1. Напишите программу, которая читает целые числа (столько, сколько введет
//пользователь) из стандартного ввода и выводит максимальное и минимальное
//значение.

//1.5.2. Измените программу из предыдущего упражнения, чтобы обрабатывались
//только положительные целые числа (если это требование не выполнено, программа
//должна напомнить пользователю о том, что числа должны быть положительными).


public class a15_MaxMinIntPositiveNumbers {
    public static void main(String[] args) {
        String str = "";
        while (!StdIn.isEmpty()){
            int n = StdIn.readInt();
            if(n < 0){
                System.out.println("number should be > 0");
            } else{
                str+= n+ " ";
            }
        }

        String[] strArr = str.split(" ");
        int[] numbersArr = new int[strArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(strArr[i]);
        }


        int min = numbersArr[0];
        int max = numbersArr[0];
        for (int i = 1; i < numbersArr.length; i++) {
            if(min > numbersArr[i]){
                min = numbersArr[i];
            }
            if(max < numbersArr[i]){
                max = numbersArr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
