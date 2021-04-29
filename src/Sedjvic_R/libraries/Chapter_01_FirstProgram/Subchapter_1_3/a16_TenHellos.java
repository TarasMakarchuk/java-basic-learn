// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.8. Перепишите программу T e n H e llo s и создайте программу H e llo s , которая
//получает в аргументе командной строки количество повторений. Можно предположить,
//что аргумент меньше 1000. Подсказка: используйте выражения i % 10
//и i % 100, чтобы определить, какой из суффиксов числительных — s t , nd, rd или
//th —должен использоваться при выводе i-ro сообщения "H e llo " .

public class a16_TenHellos {
    public static void main(String[] args) {
        int repeatQuantity = 500;
        if(repeatQuantity < 1 || repeatQuantity >= 1000){
            System.out.println("value must be less than 1000 and more than 1");
        } else {
            for (int i = 1; i < repeatQuantity; i++) {
                if(i == 1 ) {
                    System.out.println(i + "st Hello");
                }
                if(i == 2 ){
                    System.out.println(i+ "nd Hello");
                }
                if(i == 3 ){
                    System.out.println(i+ "rd Hello");
                }
                if(i % 10 == 0){
                    System.out.println(i+ "ty Hello");
                }
                if (i > 4 && i % 10 != 0){
                    System.out.println(i + "th Hello");
                }

                if (i % 100 == 0){
                    System.out.println(i + "d Hello");
                }

            }


        }
    }
}
