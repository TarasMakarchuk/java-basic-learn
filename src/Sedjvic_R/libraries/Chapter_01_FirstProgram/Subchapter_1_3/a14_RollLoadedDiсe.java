// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.5. Напишите программу R o llL o a d e dD ie , которая моделирует результат броска
//«смещенного» игрального кубика. Грани 1,2,3,4 и 5 выпадают с вероятностью 1/8,
//а грань 6 — с вероятностью 3/8.

public class a14_RollLoadedDiсe {
    public static void main(String[] args) {
        double probabilityHigh = 0.375;
        double probabilityLow = 0.125;

        for (int i = 0; i < 10; i++) {
            double randomNUmber = Math.random();
            if (randomNUmber < probabilityLow) {
                System.out.println(1 + "  " +randomNUmber);
            } else if (randomNUmber > probabilityLow && randomNUmber < probabilityLow * 2) {
                System.out.println(2 + "  " +randomNUmber);
            } else if (randomNUmber*2 > probabilityLow && randomNUmber < probabilityLow * 3) {
                System.out.println(3 + "  " +randomNUmber);
            } else if (randomNUmber*3 > probabilityLow && randomNUmber < probabilityLow * 4) {
                System.out.println(4 + "  " +randomNUmber);
            } else if (randomNUmber*4 > probabilityLow && randomNUmber < probabilityLow * 5) {
                System.out.println(5 + "  " +randomNUmber);
            } else if(randomNUmber >= probabilityLow * 5){
                System.out.println(6 + "  " +randomNUmber);
            }
        }
    }
}
