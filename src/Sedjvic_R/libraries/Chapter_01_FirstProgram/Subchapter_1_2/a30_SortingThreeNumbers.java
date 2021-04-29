// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.34. Сортировка троек. Напишите программу, которая получает в аргументах
//командной строки три целочисленных значения и выводит их упорядоченными по
//возрастанию. Используйте методы Math. min () и Math. max().

public class a30_SortingThreeNumbers {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        int num3 = 1;

        int numMax = Math.max(Math.max(num1, num2), Math.max(num2, num3));
        int numMin = Math.min(Math.min(num1, num2), Math.min(num2, num3));

        boolean compare1 = numMin < num1 && num1 < numMax;
        boolean compare2 = numMin < num2 && num2 < numMax;
        boolean compare3 = numMin < num3 && num3 < numMax;

        System.out.println(compare1 + " " + compare2 + " " + compare3);

        String result;
        if (compare1) {
            result = numMin + " " + num1 + " "  + numMax;
        } else if (compare2) {
            result = numMin + " "  + num2 + " "  + numMax;
        } else {
            result = numMin + " "  + num3  + " " + numMax;
        }

        System.out.println(result);

    }
}
