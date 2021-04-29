// created 10.10.2020
package javarussia_courses;

public class Les30_CastingPrimitiveDataTypes {
    public static void main(String[] args) {
        int c = 32; //32bit
        byte x = 127;
        short y = 16; //16bit
        long z = 64; //64 bit
        double a = 64.4; //64 bit
        float b = 32.2f; //32bit

        int aa = 123;
        long L = aa; //неявное приведение типов, типы конвертируются автоматически
        int xx = (int) L; //явное, ручное приведение типов
        System.out.println(xx);

        float ff = (float)123.3;

        double ddd = 123.5;
        int aaa = (int) ddd;
        System.out.println(aaa);

        byte bbb = (byte)128; // -128 - 127

        System.out.println(bbb);
    }

}
