// created 09.10.2020, 15:06
package javarussia_courses;

public class Arrays_of_string {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "bue";
        strings[2] = "java";

        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }

        for (String string: strings){
            System.out.println(string);
        }

        int[] numbers1 = {1,2,3};
        int sum = 0;

        for (int x: numbers1){
            sum += x;
        }
        System.out.println(sum);

        int value = 0;
        String s; //память выделяеться только под ссылку на объект

    }
}
