package javarussia_courses;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input something number here: ");
        int x = s.nextInt();
        System.out.println("you entered number: " + x);
    }
}
