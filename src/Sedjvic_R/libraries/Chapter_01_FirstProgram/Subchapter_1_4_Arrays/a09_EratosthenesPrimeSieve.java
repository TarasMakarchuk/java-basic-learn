// created 15.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//Листинг 1.4.3. Решето Эратосфена

public class a09_EratosthenesPrimeSieve {
    public static void main(String[] args) {
      int n = 23;
      boolean[] isPrime = new boolean[n+1];

        for (int i = 1; i <=n; i++) {
            isPrime[i] = true;
        }


        for (int i = 2; i <=n/2 ; i++) {
            if(isPrime[i]){
                for (int j = i; j <=n/i ; j++) {
                    isPrime[j*i] = false;
                }
            }
        }

        for (int i = 1; i <=n; i++) {
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }



    }
}
