// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.23. Напишите программу, которая получает два целых числа m и d в аргументах
//командной строки и выводит true, если день d месяца m лежит в диапазоне от 20/03
//до 20/06, или false в противном случае.

public class a20_DayMonth {
    public static void main(String[] args) {
        int month = 6;
        int day = 20;

        int startDate = 30+30+20;
        int endDate = startDate+10+30+30+20;
        int currentDate = (month-1)*30+day;

        boolean result = currentDate >= startDate && currentDate <= endDate;

        System.out.println(result);

    }
}
