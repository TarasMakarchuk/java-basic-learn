package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 28.12.2020

public class T_00_ConvertNumberToByte {
    public static void main(String[] args) {

       convertNumberToByte(-1);
    }
    public static void convertNumberToByte(int n){
        System.out.println( "0b" + Integer.toBinaryString(0b100000000 | (n & 0xff)).substring(1));
    }
}
