package javarussia_courses;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age");
        String age = scanner.nextLine();
        switch (age){
            case "one":
                System.out.println("you baby");
                break;
            case "seven":
                System.out.println("you schoolboy");
                break;
            case "sixteen":
                System.out.println("you student");
                break;
            default:
                System.out.println("none of the conditions are met");
        }
    }
}
