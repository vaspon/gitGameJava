package javarpg.Сharacters;

public class HeroTank extends GameObject {
    public HeroTank(String name,
                    int life,
                    boolean isAlive,
                    int[] levelHero,
                    int progress,
                    String[] attribute,
                    int health,
                    int damage,
                    int mana,
                    String[] sinews,
                    String[] skill,
                    String[] shmot) {
        super(
                name = "Tank",
                life = 2,
                isAlive = true,
                levelHero = new int[]{0, 0, 0},
                progress = 0,
                attribute = new String[]{"1 отрибут", "2 отрибут", "3 отрибут"},
                health = 200,
                damage = 50,
                mana = 10,
                sinews = new String[]{"1 умение","2 умение", "3 умение"},
                skill = new String[]{"1 персональное умение","2 персональное умение", "3 персональное умение"},
                shmot= new String[]{"1 шмот","2 шмот", "3 шмот"}
                );
    }

}


