// created 02.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.6. Напишите фильтр, который читает последовательность целых чисел и выводит
//их, исключая смежные повторяющиеся элементы. Например, если на вход
//поступила последовательность 1 1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1 , ваша программа
//должна вывести 1 2 1 5 1 7 1.


public class a19_FilterUniqueElementsArray {
    public static void main(String[] args) {
        String str = "";
        while(!StdIn.isEmpty()){
            int numbers = StdIn.readInt();
            str+= numbers+" ";
        }
        String[] arrayStringNumber = str.split(" ");
        String uniqueNumbersString = arrayStringNumber[0] +" ";
        for (int i = 1; i < arrayStringNumber.length; i++) {
            if(Integer.parseInt(arrayStringNumber[i-1]) != Integer.parseInt(arrayStringNumber[i])){
                uniqueNumbersString += arrayStringNumber[i] + " ";
            }
        }
        System.out.println(uniqueNumbersString);
    }
}
