// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.9. Напишите программу с одним циклом f o r и одной командой i f , которая выводит
//целые числа от 1000 до 2000, по 5 чисел на строку. Подсказка: используйте
//оператор %.

public class a17_WholeNumbers {
    public static void main(String[] args) {
        int from = 1000;
        int to = 2000;

        for (int i = from; i <= to; i++) {
            if(i % 5 == 0){
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
