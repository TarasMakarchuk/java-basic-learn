// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.28. Проверка упорядоченности. Напишите программу, которая получает три
//числа типа double х, у и z в аргументах командной строки и выводит true, если
//значения расположены строго по возрастанию или убыванию ( х < у < z или
//х> у> z ), или fa ls e в противном случае.

public class a25_CheckOrderliness {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        boolean result = a < b && b < c || a > b && b > c;

        System.out.println(result);
    }
}
