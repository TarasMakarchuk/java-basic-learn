// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.12. Напишите программу FunctionGrowth для вывода таблицы значений log п,
//n, n log п, n2, n3 и 2n для п = 16, 32, 64,..., 2048. Используйте символы табуляции
//(символы \ t ) для выравнивания столбцов.

public class a19_FunctionGrowth {
    public static void main(String[] args) {
        long n = 16;
        for (int i = 1; i <= n; i++) {
            n *= 2;
            if (n > 2048) {
                break;
            }
            System.out.print(i + "\t");
            System.out.print(Math.log(n) + "\t");
            System.out.print(n + "\t  ");
            System.out.print((n * Math.log(n)) + "\t");
            System.out.print("  " + n * n + "\t");
            System.out.print("  " + n * n * n + "\t");
            System.out.print("  " + 2 * n + "\t");
            System.out.println();
        }
    }
}

