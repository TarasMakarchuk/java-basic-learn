// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;


//1.3.32. Напишите программу PowersOf К, которая получает целое число к как аргумент
//командной строки и выводит все положительные степени к из типа данных
//Java long. Примечание: наибольшее значение типа long задается константой Long.
//MAX_VALUE.

public class a37_PowerOfK {
    public static void main(String[] args) {
        long k = 5678567687L;
        long maxValue = Long.MAX_VALUE;
        maxValue = maxValue / 2;

        int counter =1;
        String string = "";
        if (maxValue >= k / 2) {
            while (maxValue > 1) {
                maxValue = ((maxValue + 1) / 2);
                if (maxValue <= k / 2) {
                    counter++;
                    string += counter + " ";
                }
            }
        }
        System.out.println(string);
    }
}
