// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a08_CouponCollector {
    public static void main(String[] args) {
        int n = 20;

        boolean [] isCollected = new boolean[n];
        int distinct = 0;
        int counter = 0;

        while (distinct < n){
            int randomNumber = (int) (Math.random()*n);
            counter++;
            if(!isCollected[randomNumber]){
                distinct++;
                isCollected[randomNumber] = true;
            }
        }
        System.out.println(counter);

    }
}
