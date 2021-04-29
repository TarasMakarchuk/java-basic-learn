// created 09.10.2020, 14:50
package javarussia_courses;

public class Arrays1 {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных

        int[] numbers = new int [5]; //ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }

        System.out.println(" ");

        int[] numbers1 = {1,2,3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }


    }
}
