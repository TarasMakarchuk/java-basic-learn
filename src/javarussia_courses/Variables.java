package javarussia_courses;

public class Variables {
    public static void main(String[] args){
        //ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
        //целочисленные
        int myInt = 557; //32 bit
        short myShort = -32768; //16 bit -32768 to 32767
        long myLong = 1234567891; //64 bit

        //вещественные
        double myDouble = 235.25; //64 bit
        float myFloat = 432.6f; //32 bit

        //char символы, 1 символ
        char c = 'a';
        //логические
        boolean bool = myInt / myFloat > 100;
        byte myByte = 127; //8 bit -128 to 127

        System.out.println(myInt);
    }
}
