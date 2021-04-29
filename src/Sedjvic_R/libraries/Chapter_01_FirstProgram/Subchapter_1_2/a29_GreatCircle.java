// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.33. Дуга большого круга. Напишите программу G r e a tC ir c le , которая получает
//четыре значения типа double x l , y l , х2 и у2 в аргументах командной строки (широта
//и долгота в градусах двух точек земной поверхности) и выводит расстояние дуги
//большого круга между этими точками. Расстояние дуги большого круга (в морских
//милях) задается следующей формулой:
//d = 60 a rc c o s^ in ^ ) sin(x2) + cos(Xj) cos(x2) cos(z/1 - г/2)).
//Обратите внимание: в формуле используются градусы, а тригонометрические
//функции Java работают с радианами. Используйте методы M a t h . t o R a d ia n s ( )
//и M a th .to D e g r e e s Q для преобразования между угловыми единицами. Используйте
//свою программу для вычисления расстояния по дуге большого круга между
//Парижем (48,87° N и -2,33° W) и Сан-Франциско (37,8° N и 122,4° W).

public class a29_GreatCircle {
    public static void main(String[] args) {
        double latitudeDegreesX1 = 48.87;
        double longitudeDegreesY1 = -2.33;
        double latitudeDegreesX2 = 37.8;
        double longitudeDegreesY2 = 122.4;

        double latitudeRadiansX1 = Math.toRadians(latitudeDegreesX1);
        double longitudeRadiansY1 = Math.toRadians(longitudeDegreesY1);
        double latitudeRadiansX2 = Math.toRadians(latitudeDegreesX2);
        double longitudeRadiansY2 = Math.toRadians(longitudeDegreesY2);

        double arcBigCircleRadians = 60 * Math.acos(Math.sin(latitudeRadiansX1) * Math.sin(latitudeRadiansX2)
                + Math.cos(latitudeRadiansX1) * Math.cos(latitudeRadiansX2) * Math.cos(longitudeRadiansY1 - longitudeRadiansY2));
        double arcBigCircleDegrees = Math.toDegrees(arcBigCircleRadians);

        System.out.println(arcBigCircleDegrees);

    }
}
