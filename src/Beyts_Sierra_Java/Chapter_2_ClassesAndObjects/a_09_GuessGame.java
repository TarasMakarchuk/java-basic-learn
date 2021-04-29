// created 05.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;


public class a_09_GuessGame {
    Player p1; //содержит 3и переменных экземпляра для 3х объектов Player
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); //создаёт 3 объекта player и присваиваем их 3м переменным экземпляра
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; //объвляет 3 переменные для хранения вариантов от каждого игрока
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; // бьявляем 3 переменные для хранения правильного/неправильного ответов игроков
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); //генерируем число которое игроки должны угадать
        System.out.println(" загадываю число: ");

        while (true) {
            System.out.println("число, которое нужно отгадать: " + targetNumber);

            p1.guess(); // вызываем метод guess из каждого объекта Player
            p2.guess();
            p3.guess();

            guessp1 = p1.number; // извлекаем варианты каждого игрока, результаты работы их методов guess(), получая доступ к их переменным number
            System.out.println("1й игрок загадал номер: " + guessp1);

            guessp2 = p2.number;
            System.out.println("2й игрок загадал номер: " + guessp2);

            guessp3 = p3.number;
            System.out.println("3й игрок загадал номер: " + guessp3);

            if (guessp1 == targetNumber) { //проверяем варианты ответов каждого игрока на соответствие загаданному числу
                p1isRight = true; // если игрок угадал то присваиваем соответствующей переменной значение true
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { //если один из игроков угадал
                System.out.println("У нас есть победитель");
                System.out.println("1й игрок угадал?: " + p1isRight);
                System.out.println("2й игрок угадал?: " + p2isRight);
                System.out.println("3й игрок угадал?: " + p3isRight);
                System.out.println("Конец игры.");
                break; // игра окончена, так что прерываем цикл
            } else { // мы должны продолжить, т.к. никто не угадал
                System.out.println("Игроки должны попробовать ещё раз.");
            } // конец if else
        } // конец цикла while
    } // конец метода
} // конец класса

 class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю это число: " + number);
    }
}

 class GameLauncher {
    public static void main(String[] args) {
        a_09_GuessGame game = new a_09_GuessGame();
        game.startGame();
    }
}


