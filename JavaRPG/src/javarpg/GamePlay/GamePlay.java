package javarpg.GamePlay;

import javarpg.Сharacters.GameObject;
import javarpg.Сharacters.Mob;

import java.util.Random;
import java.util.Scanner;
import javarpg.Сharacters.*;

public class GamePlay {
    public static Random random = new Random();
    private Hero heroPat[] = new Hero[5];
    private Mob mobPat[] = new Mob[5];

    private Hero curHero;
    private Mob curMob;


public GamePlay() {
    initializationGame();
}



//
//    public void mainGameLoop {
//// циклы игры
//        Scanner sc = new Scanner(System.in);
////выбор героя,  циклы атаки, получения урона и тд
//    }
//

//
    public static void main(String[] args) {

    }

//инийиализация персонажей
    public void initializationGame() {
        heroPat[0] = new Hero("Танк", 1000, true, 1, 0,
                new String[]{"Attribute1", "Attribute2"}, 1000, 50, 0,
                new String[]{"sinews1", "sinews2"}, new String[]{"skill1", "skill2"},
                new String[]{"shmot1", "shmot2"}); //танк
//        heroPat[1] = new Hero //маг
//        heroPat[2] = new Hero //сапоорт
//        heroPat[3] = new Hero //саммонер
//        heroPat[4] = new Hero //ДД

        mobPat[0] = new Mob ("Тролль", 100,true, 1, 0,
                new String[]{"atr1", "atr2"},100,30,0, new String[]{"sinews1"},
                new String[]{"skill1"}, new String[]{"shmot"});
    }
}
