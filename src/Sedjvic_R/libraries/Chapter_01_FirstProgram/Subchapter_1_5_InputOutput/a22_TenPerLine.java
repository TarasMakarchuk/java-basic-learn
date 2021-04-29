// created 06.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.10. Напишите фильтр TenPerLine, который читает из стандартного ввода последовательность
//целых чисел из диапазона от 0 до 99 и выводит их по 10 чисел
//в строке с выравниванием столбцов. Затем напишите программу RandomlntSeq,
//которая получает два целочисленных аргумента командной строки типи выводит
//п случайных целых чисел от 0 до т-1. Протестируйте свои программы командой
//java RandomlntSeq 200 100 | java TenPerLine.

// 5 6 7 8 9 10 11 12 15 18 44 87 96 12 10 0 100 12 13 14 15 89 88 87 86 75 5 45 44 33

import Sedjvic_R.libraries.StdOut;

public class a22_TenPerLine {
    public static void main(String[] args) {
        System.out.print("enter numbers in the range from 0 to 100: ");
        String str = "";

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            str += n + " ";
        }

        String[] arrStringNumbers = str.split(" ");
        int[] arrNumbers = new int[arrStringNumbers.length];

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = Integer.parseInt(arrStringNumbers[i]);
        }

        int counter = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] < 0) {
                System.out.println("number " + arrNumbers[i] + " less than 0");
            }
            if (arrNumbers[i] > 100) {
                System.out.println("number " + arrNumbers[i] + " more than 100");
            }
            counter++;
            StdOut.print(arrNumbers[i] + "\t");

            if (counter == 10) {
                counter = 0;
                StdOut.println();
            }
        }
    }
}
