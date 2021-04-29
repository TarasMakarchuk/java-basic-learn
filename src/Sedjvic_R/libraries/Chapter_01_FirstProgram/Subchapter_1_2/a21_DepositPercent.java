// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.24. Капитализация процентов. Напишите программу, которая вычисляет и выводит
//сумму, которую вы получите через t лет при размещении Р долларов под
//ежегодный процент r (непрерывно начисляемый). Искомое значение вычисляется
//по формуле (Ре) pow rt.


public class a21_DepositPercent {
    public static void main(String[] args) {
        int termYearN = 1;
        int depositSumP = 1000;
        double percentR = 9.99;

        double percentSum = depositSumP*Math.pow(2.78, percentR/100*termYearN);
        System.out.println(percentSum);
    }
}
