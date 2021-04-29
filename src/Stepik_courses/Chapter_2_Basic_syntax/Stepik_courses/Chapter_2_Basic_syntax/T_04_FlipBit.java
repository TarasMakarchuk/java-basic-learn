package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 15.12.2020

//Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
// Данная задача актуальна, например, при работе с битовыми полями.
//        Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
//
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
//        добавит проверяющая система.
//        Sample Input:
//        0 1
//        Sample Output:
//        1
//        13 1 12
//        13 2 15
//        13 3 9
//        13 4 5

public class T_04_FlipBit {

    public static void main(String[] args) {
        System.out.println(flipBit(13, 3));
        System.out.println(flipBit1(13, 3));
    }

    public static int flipBit(int value, int bitIndex) {
        int mask = 1 << bitIndex - 1;
        printBinary(bitIndex);
        printBinary(1 << bitIndex);
        printBinary(1 << bitIndex - 1);
        printBinary(value);
        printBinary(value ^ mask);
        return value ^ mask;
    }

    public static int flipBit1(int value, int bitIndex) {
        String bitString = Integer.toBinaryString(value);

        StringBuilder reverseBitString = new StringBuilder();
        reverseBitString.append(bitString);
        reverseBitString.reverse();

        String symbol = reverseBitString.substring(bitIndex -1, bitIndex);

        String newBitString = "";

        if(symbol.equals("0")){
            newBitString = reverseBitString.substring(0, bitIndex - 1) + "1" + reverseBitString.substring(bitIndex);
        }
        if(symbol.equals("1")){
            newBitString = reverseBitString.substring(0, bitIndex - 1) + "0" + reverseBitString.substring(bitIndex);
        }

        StringBuilder reverseBitStringFinal = new StringBuilder();
        reverseBitStringFinal.append(newBitString);
        reverseBitStringFinal.reverse();

        return Integer.parseInt(String.valueOf(reverseBitStringFinal), 2);

    }

    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }
}
