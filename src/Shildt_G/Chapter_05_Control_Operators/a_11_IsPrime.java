// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_11_IsPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num =101;
        if(num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("number is prime");
        else System.out.println("number does not prime");
    }
}
