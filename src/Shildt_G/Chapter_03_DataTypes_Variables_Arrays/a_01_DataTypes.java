// created 13.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_01_DataTypes {
    public static void main(String[] args) {
        //numeric integer
        byte b = 8;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_000_000_000_000_000L;
        //numeric float
        float f = 15.99F;
        double d = 1888888888888888888885.8888888888888;
        //char
        char c = '\u0000';
        char c1 = 'г';
        //boolean
        boolean bool = true;


        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        int length = 1000;
        int portion = 100;
        int increment = length/portion;
        for (int j = 0; j < length; j++) {
            c++;

            if (j <= increment) {
                System.out.print(c + " " + (int) c + " || ");
            }

            if(j == increment){
                increment += length/portion;
                System.out.println(" -- row " +j + "  ");
                System.out.println("---------------------------------------------------------------------------------------");
            }

        }
    }
}
