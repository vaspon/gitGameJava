package javarpg.Сharacters;

public class HeroTank extends GameObject {
    public HeroTank(String name,
                    int life,
                    boolean isAlive,
                    int levelHero,
                    int progress,
                    String[] attribute,
                    int health,
                    int damage,
                    int mana,
                    String[] sinews,
                    String[] skill,
                    String[] shmot) {
        super(
                name,
                life,
                isAlive,
                levelHero,
                progress,
                attribute,
                health,
                damage,
                mana,
                sinews,
                skill,
                shmot);
    }

}


