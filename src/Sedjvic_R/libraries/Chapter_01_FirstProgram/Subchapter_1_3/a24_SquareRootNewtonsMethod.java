// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;


//1.3.19. Покажите, что листинг 1.3.6 реализует метод Ньютона для поиска квадратного
//корня с. Подсказка: воспользуйтесь тем фактом, что угол наклона касательной
//дифференцируемой функции f(x ) в точке х = t равен /'(О» для нахождения
//уравнения касательной, после чего воспользуйтесь уравнением для определения
//точки пересечения касательной с осью х. Покажите, что метод Ньютона может
//использоваться для нахождения корня произвольной функции, следующим образом:
//при каждой итерации замените очередную точку приближения t значением
//t-F(t)/F'(t)


//todo Newton squareRoot
//public static void main(String[] args) {
//        double number = 9;
//        double t= number;
//
//        double epsilon = 1e-15;
//
//        while (Math.abs(t  - number/t) >= epsilon * t){
//            t = (number / t + t) /2;
//        }
//        System.out.println(t);
//    }


//todo didn't decide
public class a24_SquareRootNewtonsMethod {
    public static void main(String[] args) {
        double number = 9;
        double t = number;

        double epsilon = 1e-3;

        while (Math.abs(t - number/t) >= epsilon * t ){
            t = (t - Math.pow(t, 2) / (t *2));
            System.out.println(t);
        }

    }
}
