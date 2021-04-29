// created 18.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_09_RulesPromotionTypes {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) + " + " + (i/c) + " - " + (d*s));
        System.out.println("result = " + result);
    }
}
