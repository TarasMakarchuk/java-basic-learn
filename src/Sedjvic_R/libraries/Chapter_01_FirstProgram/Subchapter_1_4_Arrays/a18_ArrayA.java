// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.1. Напишите программу, которая объявляет, создает и инициализирует массив
//а [ ] длины 1000 и обращается к элементу а [1000]. Компилируется ли ваша
//программа? Что происходит при ее запуске?

public class a18_ArrayA {
    public static void main(String[] args) {
        int[] a  = new int[1000];
        System.out.println(a[1000]);
    }
}
