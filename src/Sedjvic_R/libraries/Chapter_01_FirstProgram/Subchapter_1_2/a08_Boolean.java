// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.3. Предположим, а и b — переменные типа boolean. Покажите, что результат
//выражения (! (а && Ь) && (а 11 Ь)) | | ((а && Ь) | | ! (а 11 Ь)) равен true.

public class a08_Boolean {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        boolean result = (!(a&&b) && (a||b)) || ((a&&b) || !(a||b));
        System.out.println(result);
    }
}
