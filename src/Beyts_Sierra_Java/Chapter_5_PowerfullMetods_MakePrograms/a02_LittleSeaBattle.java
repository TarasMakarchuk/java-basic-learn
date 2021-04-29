// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

import java.util.Scanner;


//todo этот код я сам написал
public class a02_LittleSeaBattle {
    public static void main(String[] args) {
        SeaBattle battle = new SeaBattle();
        battle.start();
    }
}

class SeaBattle {

    public void start() {
        int[] shipSize = {1, 2, 3};
        int[] locations = new int[6];
        int shipPositionShift = (int) Math.ceil(Math.random() * locations.length / shipSize.length);

        System.out.print("размер поля - " + locations.length + " ячеек");
        System.out.println(", длина корабля - " + shipSize.length + " ячейки");
//        for (int i = 0; i < locations.length; i++) {
//            if (i >= shipSize[0] && i <= shipSize.length) {
//                locations[i + shipPositionShift] = i;
//            }
//            System.out.print(" x ");
//        }

        int i = 0;
        for(int location: locations){
            if (i >= shipSize[0] && i <= shipSize.length) {
                locations[i + shipPositionShift] = i;
            }
            i++;
            System.out.print(" x ");
        }

        System.out.println(" ");
        playerMove(shipSize, locations);
    }

    public void playerMove(int[] shipSize, int[] locations) {
        int count = 0;
        int playerMove;
        Scanner userInput = new Scanner(System.in);

        while (count < shipSize.length) {
            System.out.print("ход игрока: ");
            playerMove = userInput.nextInt();

            if (playerMove < 0 || playerMove > locations.length) {
                System.out.println("число не может быть меньше 0 или больше величны поля");
                continue;
            }


            if (locations[playerMove] != 0) {
                System.out.println("есть попадание!");
                locations[playerMove] = 0;
                count++;
            } else {
                System.out.println("мимо!");
            }
        }

        if (count == shipSize.length) {
            System.out.println("вы победили!");
            userInput.close();
        }
    }
}
