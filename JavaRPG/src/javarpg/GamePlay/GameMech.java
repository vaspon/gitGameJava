package javarpg.GamePlay;

import java.util.Random;
import java.util.Scanner;

public class GameMech {

    int location = 0;
    boolean out;
    boolean victory = true;

        System.out.println("Веберите игрока:\n1-Танк\n2-Маг\n3-Саппорт\n4-Саммонер\n5-DD");


        do {
        out = false;

        switch ( KeyInput()){
            case (1):
                System.out.println("Вы выбрали игрока Танк");
                // * - вызов объекта Танк
                break;

            case (2):
                System.out.println("Вы выбрали игрока Маг");
                // * - вызов объекта Маг
                break;

            case (3):
                System.out.println("Вы выбрали игрока Саппорт");
                // * - вызов объекта Саппорт
                break;

            case (4):
                System.out.println("Вы выбрали игрока Саммонер");
                // * - вызов объекта Саммонер
                break;

            case (5):
                System.out.println("Вы выбрали игрока DD");
                // * - вызов объекта DD
                break;

            default:
                System.out.println("Вы ввели не верное значение");
                out = true;
                break;
        }
    }while (out);


            switch (NumberGenerator(1, 5)) {
        case (1):
            System.out.println("Вы очнулись в каком-то сарае, слышите лай собак.\nЧто это деревня?");
            location = 1;
            break;

        case (2):
            System.out.println("Вы очнулись в c негу, что-то очень холодно.\nЭто горы.");
            location = 2;
            break;

        case (3):
            System.out.println("Вы онулись на барегу озера.\nКак же меня могло занести в это болото?");
            location = 3;
            break;

        case (4):
            System.out.println("Вы очнулись в лесу.\nЛес, кругом лес?");
            location = 4;
            break;

        case (5):
            System.out.println("Вы очнулись, чусвтвуете запах гнили и сырости.\nЧто я делаю в замке?");
            location = 5;
            break;
    }

    // игра
        do {

        System.out.println("На вас напали!");
        // * - вызов метода боя
        // * - вызов метода подсчёта очков

        location = ChoiceRoad(location);

        System.out.println("для выхода нажмите 0"); // временное условие
        if (KeyInput() == 0) // Условия победы
            victory = false;

    }while (victory);




    // метод ввода данных с клавиатуры
    public static int KeyInput (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // метод Рандом
    public static int NumberGenerator (int min, int max){
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        return i + min;
    }

    // метод выбора пути
    public static int ChoiceRoad (int loc){
        switch (loc) {
            case (1):
                System.out.println("Выберите дорогу, куда пойдёте:\n1 - в лес\n2 - к озеру\n3 - к мосту");

                int key1 = KeyInput();
                if (key1 == 1){
                    System.out.println("Вы пришли в лес");
                    loc = 4;
                    break;
                }
                if (key1 == 2){
                    System.out.println("Вы пришли к озеру");
                    loc = 3;
                }else{
                    System.out.println("Вы пришли к мосту");
                    loc = 6;
                }
                break;

            case (2):
                System.out.println("Выберите дорогу, куда пойдёте:\n1 - к мосту\n2 - в пещеру");

                int key2 = KeyInput();
                if (key2 == 1){
                    System.out.println("Вы пришли к мосту");
                    loc = 6;
                }else{
                    System.out.println("Вы пришли в пещеру");
                    loc = 7;
                }
                break;

            case (3):
                System.out.println("Выберите дорогу, куда пойдёте:\n1 - в деревню\n2 - к мосту\n3 - в замок");

                int key3 = KeyInput();
                if (key3 == 1){
                    System.out.println("Вы пришли в деревню");
                    loc = 1;
                    break;
                }
                if (key3 == 2){
                    System.out.println("Вы пришли к мосту");
                    loc = 6;
                }else{
                    System.out.println("Вы пришли в замок");
                    loc = 5;
                }
                break;

            case (4):
                System.out.println("Выберите дорогу, куда пойдёте:\n1 - в деревню\n2 - в замок");

                int key4 = KeyInput();
                if (key4 == 1){
                    System.out.println("Вы пришли в деревню");
                    loc = 1;
                }else{
                    System.out.println("Вы пришли в замок");
                    loc = 5;
                }
                break;

            case (5):
                System.out.println("Выберите дорогу, куда пойдёте:\n1 - в лес\n2 - к озеру");

                int key5 = KeyInput();
                if (key5 == 1){
                    System.out.println("Вы пришли в лес");
                    loc = 4;
                }else{
                    System.out.println("Вы пришли к озеру");
                    loc = 3;
                }
                break;

            case (6):
                System.out.println("Выберите дорогу, куда пойдёте:\n1 - к озеру\n2 - в горы");

                int key6 = KeyInput();
                if (key6 == 1){
                    System.out.println("Вы пришли к озеру");
                    loc = 3;
                }else{
                    System.out.println("Вы добрались до гор");
                    loc = 2;
                }
                break;

            case (7):
                System.out.println("Вы вышли из пещеры");
                loc = 2;
                break;
        }
        return loc;
    }

    // метод боя...
    public int makeAttack() {
        int minAttack = (int)(attack * 0.9f);
        int deltaAttack = (int)(attack * 0.2f);
        int curAttack = minAttack + (GamePlay.random.nextInt(deltaAttack));
        if (GamePlay.random.nextInt(100) < critChance) {
            curAttack *= 2;
            System.out.println(name + " нанес критический урон в размере " + curAttack + "ед. урона");
        }
        else
            System.out.println(name + " нанес " + curAttack + "ед. урона");
        return curAttack;
    }
}
