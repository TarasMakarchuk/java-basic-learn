// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.2. Опишите и объясните, что произойдет при попытке откомпилировать программу
//со следующей командой:


public class a19_Array1000x1000x1000x1000 {
    public static void main(String[] args) {
        int n = 1000;
        int[] a = new int [1000*1000*1000*1000];
        System.out.println(a.length);
    }
}
