// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.4. Предположим, а и b — переменные типа int. Упростите следующее выражение:
//(! (а < Ь) && ! (а > Ь)).

public class a09_Boolean {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        //(! (а < Ь) && ! (а > Ь))
        boolean compare = a == b;

        System.out.println(compare);
    }
}
