// created 19.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;


//1.4.16. Напишите программу, которая получает целое число п как аргумент
//командной строки и создает массив n х п а[ ] [] с элементами boolean. Элемент
//а [ i] [ j] равен true, если значения i и j являются взаимно простыми (не имеют
//общих множителей), или f a ls e в противном случае. Используйте свое решение
//к упражнению 1.4.6 для вывода массива. Подсказка: используйте решето
//Эратосфена.


public class a29_EratosthenesTable {
    public static void main(String[] args) {
        int n = 9;
        boolean[][] table = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i][j] = true;
            }
        }

        for (int i = 2; i <= n / i; i++) {
            for (int j = 1; j <= n / i; j++) {
                    for (int k = 1; k <= n; k++) {
                        for (int m = 1; m <= n; m++) {
                            if (table[i][j]) {
                            if ((k % 2 == 0 || m % 2 == 0) && (m > 2 && k > 2)) {
                                table[k][m] = false;
                                table[m][k] = false;
                            }
                            else if(k % j == 0 && j > 2){
                                table[j*i][m] = false;
                                table[m][j*i] = false;
                            }
//
                            else if(m % j == 0 && j > 1){
                                table[j*i][k] = false;
                                table[k][j*i] = false;
                            }
                        }
                    }
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("[" + i + " " + j + "] \t");
                System.out.print(table[i][j] + "\t");
//                if (table[i][j]){
//                    System.out.print(" X ");
//                } else{
//                    System.out.print(" - ");
//                }

            }
            System.out.println();
        }
    }
}
