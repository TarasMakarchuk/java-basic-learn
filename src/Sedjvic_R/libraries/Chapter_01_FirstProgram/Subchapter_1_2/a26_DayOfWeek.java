// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;


//1.2.29. День недели. Напишите программу, которая получает дату и выводит день
//недели, на который приходится эта дата. Ваша программа должна получать три
//значения типа int в аргументах командной строки: m (месяц), d (день) и у (год).
//Значение m равно 1 для января, 2 — для февраля и т. д. Программа выводит 0 для
//воскресенья, 1 — для понедельника, 2 — для вторника и т. д. Вычисление выполняется
//по следующим формулам из григорианского календаря:
//Уо = У ~ (1^ - от) / 12
//х = У0 + Уо/4 ~Уо/ЮО + г/о/400
//т 0 = m + 12 х ((14 - /и) / 12) - 2
//d0 = (d + х+ (31 х т0) / 12) % 7
//Пример: на какой день недели приходится 14 февраля 2000 года?
//у0 = 2000 - 1 = 1999
//х = 1999 + 1999 / 4 - 1999 / 100 + 1999 / 400 = 2483
//т 0 = 2 + 12 х 1 - 2 = 12
//d0 = (14 + 2483 + (31 х 12) / 12) % 7 = 2500 % 7 = 1
//Ответ: понедельник.

public class a26_DayOfWeek {
    public static void main(String[] args) {
        int day = 14;
        int month = 2;
        int year = 2000;

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12*((14-month)/12)-2;
        int dayOfWeek = (day + x +(31 * m0)/12)%7;

        System.out.println("yo " + y0);
        System.out.println("x " + x);
        System.out.println("m0 " + m0);
        System.out.println("Now day of week = " + dayOfWeek);
    }
}