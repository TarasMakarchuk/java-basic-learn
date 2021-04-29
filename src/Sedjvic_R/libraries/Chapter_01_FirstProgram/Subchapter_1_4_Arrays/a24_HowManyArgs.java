// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.11. Напишите программу HowMany, которая получает переменное количество
//аргументов командной строки и сообщает, сколько аргументов было передано.

public class a24_HowManyArgs {
    public static void main(String[] args) {
        System.out.println("was be pass: " + args.length +" args");
        for (int i = 0; i < args.length; i++) {
            String n = args[i];
            System.out.print(n + " ");
        }


    }
}
