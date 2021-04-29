// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.31. Напишите программу RelativelyPrime, которая получает целое число п
//как аргумент командной строки и выводит таблицу п * п, в которой в строке i
//и столбце j выводится *, если НОД i и j равен 1 ( i и j — взаимно простые числа),
//или пробел в противном случае.

public class a36_RelativelyPrime {
    public static void main(String[] args) {
        int n = 32;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i;
                int y = j;
                int result = 0;
                if(x == 0 || y == 0){
                    result = y;
                } else if (x % y == 0) {
                    result = y;
                } else if (x < y) {
                    result = x;
                } else {
                    int ost1 = x % y;
                    int ost2 = y % ost1;
                    int ost3 = 0;

                    if (ost2 == 0) {
                        result = ost1;
                    } else if (ost2 == 1) {
                        result =  ost2;
                    } else {
                        while (ost3 != 1) {
                            ost3 = ost1 % ost2;
                            ost1 = ost2;
                            ost2 = ost3;
                            if (ost3 == 0) {
                                break;
                            }
                        }
                        result =  ost3;
                    }
                }

                if(result == 1){
                    System.out.print("|_*_|");
                } else {
                    System.out.print("|___|");
                }
            }

            System.out.println("|___|");
        }
    }


}
