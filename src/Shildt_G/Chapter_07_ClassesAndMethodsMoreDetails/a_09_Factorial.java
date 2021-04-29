// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_09_Factorial {
    int factorial(int n) {
        int result;
        if (n <= 1) {
            return 1;
        } else {
            result = factorial(n - 1) * n;
            return result;
        }
    }
}

class Recursion{
    public static void main(String[] args) {
        a_09_Factorial myFactorial = new a_09_Factorial();
        System.out.println("factorial 3 equals: " + myFactorial.factorial(3));
        System.out.println("factorial 4 equals: " + myFactorial.factorial(4));
        System.out.println("factorial 5 equals: " + myFactorial.factorial(5));
    }
}