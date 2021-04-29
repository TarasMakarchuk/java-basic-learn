// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.4. Напишите фрагмент кода, который выводит сообщение " t r u e " , если переменные
//х и у типа d o u b le лежат строго в диапазоне от 0 до 1, или " f a ls e " в противном
//случае.

public class a13_NumbersInTheRange {
    public static void main(String[] args) {
        double x = 0.238475;
        double y = 0.9999998;

        if ((x >= 0 && x <= 1) && (y >= 0 && y <= 1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
