// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.21. На основе программы Binary создайте программу Кагу, которая получает
//два целых числа i и к в аргументах командной строки и преобразует i в систему
//счисления с основанием к. Предполагается, что i — целое число с типом данных
//Java long, а к — целое число в диапазоне от 2 до 16. В системах счисления с основанием
//больше 10 для представления цифр, соответствующих

//     Наиболее часто употребляемыми в настоящее время позиционными системами являются:
//        2 — двоичная (в дискретной математике, информатике, программировании);
//        3 — троичная;
//        8 — восьмеричная;
//        10 — десятичная (используется повсеместно);
//        12 — двенадцатеричная (счёт дюжинами);
//        16 — шестнадцатеричная (используется в программировании, информатике);
//        20 — двадцатеричная;
//        60 — шестидесятеричная (единицы измерения времени, измерение углов и, в частности, координат, долготы и широты).


public class a26_Kary {
    public static void main(String[] args) {
        long i = 1000000000000000000L;
        long k = 16;

        if (k == 2) {
            long number = i;
            long power2 = 1;
            while (power2 <= number / 2) {
                power2 *= 2;
            }
            while (power2 > 0) {
                if (number < power2) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                    number -= power2;
                }

                power2 /= 2;
            }
            System.out.println("binary = " + power2);
        }

        if (k == 8) {
            long number = i;
            long remainder = 0;
            long result = 0;

            while (number > 0) {
                remainder = number % 8;
                number = (number - remainder) / 8;
                result = result * 10 + remainder;
            }

            long revertResult = 0;
            while (result > 0) {
                revertResult = revertResult * 10 + result % 10;
                result = result / 10;
            }

            if (i == 8) {
                revertResult = 8;
            }

            if (revertResult > 8 && revertResult < 10) {
                revertResult = revertResult * 10;
            }
            System.out.println("octal  = " + revertResult);
        }


        if (k == 16) {
            long number = i;
            long remainder = 0;
            long result = 0;
            String stringResult = "";

            while (number > 0) {
                remainder = number % 16;
                number = (number - remainder) / 16;
                result = result * 10 + remainder;

                if (remainder == 10) {
                    stringResult += "A";
                } else if (remainder == 11) {
                    stringResult += "B";
                } else if (remainder == 12) {
                    stringResult += "C";
                } else if (remainder == 13) {
                    stringResult += "D";
                } else if (remainder == 14) {
                    stringResult += "E";
                } else if (remainder == 15) {
                    stringResult += "F";
                } else {
                    stringResult += remainder;
                }
            }

            String reverseStringResult = "";
            for (int j = 0; j < stringResult.length(); j++) {
                reverseStringResult = stringResult.charAt(j) + reverseStringResult;
            }
            System.out.println("hexadecimal = " + reverseStringResult);
        }
    }
}

