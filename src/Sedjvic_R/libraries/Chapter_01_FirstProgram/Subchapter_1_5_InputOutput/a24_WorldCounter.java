// created 06.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.11. Напишите программу, которая читает текст из стандартного ввода и выводит
//количество слов в тексте. В контексте данного упражнения «словом» считается
//последовательность символов, не являющихся пробельными, заключенная между
//пробельными символами.

public class a24_WorldCounter {
    public static void main(String[] args) {
        String str = "";

        while (!StdIn.isEmpty()){
            str += StdIn.readString() + " ";
        }
        String[] arrStr = str.split(" ");
        System.out.println("quantity word in text: " + arrStr.length);

        
    }
}
