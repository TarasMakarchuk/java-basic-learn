// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.30. Напишите программу GreatestCommonDivisor для нахождения наибольшего
//общего делителя (НОД) двух чисел по алгоритму Евклида. Этот итерационный
//алгоритм основан на следующем наблюдении: если х больше у, то если х делится
//на у, то НОД х и у равен у; в противном случае НОД х и у равен НОД х % у и у.

public class a35_EuclidAlgorithmGreatestCommonDivisor {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        if(x == 0 || y == 0){
            System.out.println("0 greatest common divider = " + y);
        } else if (x % y == 0) {
            System.out.println("1 greatest common divider = " + y);
        } else if (x < y) {
            System.out.println("2 greatest common divider = " + x);
        } else {
            int ost1 = x % y;
            int ost2 = y % ost1;
            int ost3 = 0;

            if (ost2 == 0) {
                System.out.println("3 greatest common divider = " + ost1);
            } else if (ost2 == 1) {
                System.out.println("4 greatest common divider = " + ost2);
            } else {
                while (ost3 != 1) {
                    System.out.println("while");
                    ost3 = ost1 % ost2;
                    ost1 = ost2;
                    ost2 = ost3;
                    if (ost3 == 0) {
                        break;
                    }
                    System.out.println(ost3);
                }
                System.out.println("5 greatest common divider = " + ost3);
            }
        }
    }
}
