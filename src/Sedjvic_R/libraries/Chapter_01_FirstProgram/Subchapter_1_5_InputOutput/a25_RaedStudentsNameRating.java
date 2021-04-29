// created 06.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.12. Напишите программу для чтения строк из стандартного ввода. Каждая
//строка содержит имя и два целых числа. Затем используйте p r in t f () для вывода
//таблицы со столбцами, содержащими имена, целые числа и результат деления
//первого числа на второе с точностью до трех знаков в дробной части. Например,
//такая программа может использоваться для вычисления средних оценок студентов.

//asds 45 67

import Sedjvic_R.libraries.StdOut;

public class a25_RaedStudentsNameRating {
    public static void main(String[] args) {
        String text = "";
        while (!StdIn.isEmpty()){
            String str = StdIn.readString();
            text += str + " ";
        }

        String[] arrString = text.split(" ");
        String name = arrString[0];
        int rating1 = Integer.parseInt(arrString[1]);
        int rating2 = Integer.parseInt(arrString[2]);
        double average = (double) rating1 /rating2;

        StdOut.printf(" Name: %s \n Rating1: %s \n Rating2: %s \n Average rating: %.3f", name, rating1, rating2, average);
//        StdOut.printf(name + " "+ rating1 +" "+ rating2+ " " + average);
    }
}
