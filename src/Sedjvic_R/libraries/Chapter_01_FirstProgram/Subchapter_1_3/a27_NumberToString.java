// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.22. Напишите фрагмент кода, который переводит двоичное представление положительного
//целого числа п в переменную s типа String.

public class a27_NumberToString {
    public static void main(String[] args) {
        int number = 23;
        int number1 = 23;

        //todo v1
        int power = 1;
        String stringNumber = "";
        while (power <= number / 2) {
            power = power * 2;
        }

        while(power > 0){
            if(number < power){
                stringNumber += 0;
            } else{
                number = number - power;
                stringNumber+= 1;
            }
            power = power /2;
        }
        System.out.println(stringNumber);

        //todo v2
        String resultString = "";
        for (int i = number1; i > 0; i /=2) {
            resultString = (i%2) + resultString;
        }

        System.out.println(resultString);
    }
}
