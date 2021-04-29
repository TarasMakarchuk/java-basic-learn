// created 04.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.7. Напишите программу, которая получает целое число п как аргумент командной
//строки, читает n-1 разных целых чисел от 1 до n и определяет отсутствующее
//среди них значение.

public class a20_FindMissingNumbers {
    public static void main(String[] args) {
        String strNumbers = "";
        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            strNumbers += n + " ";
        }

        String[] stringNumbersArray = strNumbers.split(" ");

        int number = Integer.parseInt(stringNumbersArray[0]);

        String[] arrMissingNumbersString = new String[number];
        for (int i = 1; i < arrMissingNumbersString.length; i++) {
            arrMissingNumbersString[i] = Integer.toString(i);
        }

        int counter;
        for (int i = 1; i < arrMissingNumbersString.length; i++) {
            counter = 0;
            for (int j = 1; j < stringNumbersArray.length; j++) {
                if (arrMissingNumbersString[i].equals(stringNumbersArray[j])) {
                    counter = 1;
                    break;
                }
            }
            if(counter == 0){
                System.out.println(arrMissingNumbersString[i]);
            }
        }
    }
}