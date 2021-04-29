// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.1. Напишите программу, которая получает три целых числа как аргументы
//командной строки и выводит сообщение " e q u a l" , если все три числа равны, или
//"n o t e q u a l" в противном случае.

public class a11_CheckToEquals {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        if (num1 == num2 && num2 == num3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
