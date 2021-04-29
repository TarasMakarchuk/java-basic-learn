// created 23.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//Листинг 1.5.1. Генерирование случайной последовательности

public class a00_RandomSeq {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }
}
