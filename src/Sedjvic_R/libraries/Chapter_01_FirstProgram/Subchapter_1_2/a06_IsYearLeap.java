// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

public class a06_IsYearLeap {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeapYear;
        isLeapYear = year % 4 == 0;
        isLeapYear = isLeapYear && year % 100 !=0;
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);

        System.out.println(Math.round(6.022e23));
    }
}
