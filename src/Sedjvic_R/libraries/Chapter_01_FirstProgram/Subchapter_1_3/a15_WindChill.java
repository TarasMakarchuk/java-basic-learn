// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

// 1.2.25. Охлаждение под действием ветра. Для заданной температуры Т (по шкале
//Фаренгейта) и скорости ветра v (в милях в час) Национальная метеорологическая
//служба вычисляет фактическую температуру (охлаждение под действием ветра)
//по формуле:
//w = 35.74 + 0.6215 T+ (0.4275 Т — 35.75) v pow(0,16).
//Напишите программу, которая получает два числа типа double tem p e ra tu re
//и velocity в аргументах командной строки и выводит величину охлаждения. Для
//вычисления ab используйте Math. pow(a, b). Примечание: формула недействительна,
//если абсолютное значение Т больше 50 или если v больше 120 или меньше 3 (предполагается,
//что полученные значения лежат в этом диапазоне).
//3 Computer


// 1.3.6. Усовершенствуйте свое решение упражнения 1.2.25: добавьте код, который
//        проверяет, что значения аргументов командной строки лежат в диапазонах допустимых
//        значений формулы, а также код для вывода сообщения об ошибке при
//        нарушении ограничений.

public class a15_WindChill {
    public static void main(String[] args) {
        int temperatureFahrenheit = 51;
        int velocityMilesHour = 100;

        boolean verify = temperatureFahrenheit <= 50 && velocityMilesHour >= 3 && velocityMilesHour <=120;
        if(verify){
            double result = 35.74 + 0.6215 * temperatureFahrenheit + (0.4275 * temperatureFahrenheit -35.75) * Math.pow(velocityMilesHour, 0.16);
            System.out.println(result);
        } else{
            System.out.println("the data more on less than the specified values");
        }


    }
}
