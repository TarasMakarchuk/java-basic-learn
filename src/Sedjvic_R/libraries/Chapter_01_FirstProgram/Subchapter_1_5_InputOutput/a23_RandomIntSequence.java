// created 06.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.10. Напишите фильтр TenPerLine, который читает из стандартного ввода последовательность
//целых чисел из диапазона от 0 до 99 и выводит их по 10 чисел
//в строке с выравниванием столбцов. Затем напишите программу RandomlntSeq,
//которая получает два целочисленных аргумента командной строки типи выводит
//n случайных целых чисел от 0 до m-1. Протестируйте свои программы командой
//java RandomlntSeq 200 100 | java TenPerLine.


public class a23_RandomIntSequence {
    public static void main(String[] args) {
        String str = "";
        System.out.println("enter two numbers n and m and press ctrl+D: ");
        while(!StdIn.isEmpty()){
            int numbers = StdIn.readInt();
            str+= numbers + " ";
        }

        String[] arrStringNumbers = str.split(" ");
        int n = Integer.parseInt(arrStringNumbers[0]);
        int m = Integer.parseInt(arrStringNumbers[1]);

        String s = "";
        for (int i = 0; i < n; i++) {
            s+= ((int)(Math.random()*m) + " ");
            System.out.print(s);
        }

    }
}
