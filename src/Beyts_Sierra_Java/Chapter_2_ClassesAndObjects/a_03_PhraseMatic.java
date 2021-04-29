// created 04.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_03_PhraseMatic {
    public static void main(String[] args) {
        String [] str1= {"красивый", "интермодуляционный","3000-сильный", "9и бальный", "перспективно-корекционный"};
        String [] str2= {"загадочный", "перекомпилируемый","инетпретируемый", "школьный", "весёлый"};
        String [] str3= {"автобус", "бублик","автомобиль", "тим лид"};

        int oneLength = str1.length;
        int twoLength = str2.length;
        int threeLength = str3.length;

        int rand1 = (int) (oneLength * Math.random());
        int rand2 = (int) (twoLength * Math.random());
        int rand3 = (int) (threeLength * Math.random());

        String phrase = str1[rand1] + " " + str2[rand2] + " " + str3[rand3];

        System.out.println("Всё что нам нужно это - " + phrase);
    }
}
