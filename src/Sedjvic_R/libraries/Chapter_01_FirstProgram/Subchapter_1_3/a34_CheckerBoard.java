// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.29. Напишите программу Checkerboard, которая получает целое число п как аргумент
//командной строки и использует вложенные циклы для вывода двумерного
//узора «шахматной доски» из чередующихся пробелов и звездочек.

public class a34_CheckerBoard {
    public static void main(String[] args) {
        int size = 8;


        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if((j+i) % 2 == 0){
                    System.out.print("|_*_");
                } else {
                    System.out.print("|___");
                }
            }
            System.out.println("|");
        }
    }
}
