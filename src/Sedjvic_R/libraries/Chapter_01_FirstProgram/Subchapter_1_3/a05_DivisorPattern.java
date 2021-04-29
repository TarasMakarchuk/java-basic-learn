// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//Программа получает целочисленный аргумент n в командной строке и использует вложенные
//циклы for для вывода таблицы n х n, в которой на пересечении строки i и столбца j
//стоит звездочка, если i делится на j или j делится на i Переменные цикла i и j управляют
//ходом вычислений.

public class a05_DivisorPattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i % j == 0) || (j % i == 0)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println(i);
        }
    }
}
