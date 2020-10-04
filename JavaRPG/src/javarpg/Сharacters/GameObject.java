package javarpg.Сharacters;
import javarpg.GamePlay.*;

public class GameObject {

    /** у каждого героя (положительного) есть 10 общих данных объекта
     =======    =======   ======
     /** у каждого героя (положительного) есть 12 общих данных объекта
=======
//АНДРЮХА ЛУЧШЕ ВСЕХ
    /** у каждого героя (положительного) есть 10 общих данных объекта
     =======
     /** у каждого героя (положительного) есть 12 общих данных объекта
     }
}

     * - name / имя
     * - life / жизнь
     * - isAlive / жив или мертв
     * - levelHero / уровень героя (всего их 50)
     * - progress / достижения (мастер PVE, мастер PVP, мастер Knowledge)
     * - attribute / атрибуты
     * - health / броня
     * - damage / поглащение урона
     * - mana / мана (энергия для использования в заклинаниях (в магии))
     * - sinews / уменя (максимум 5)
     * - skill / скилл (персональное умение)
     * - shmot / шмот физический и магический
     * - attack / сила атаки
    */

    String name;
    boolean life;
    boolean isAlive;
    int levelHero;
    int progress;
    String[] attribute;

    int health;
    int damage;
    int mana;
    String[] sinews;
    String[] skill;
    String[] shmot;
    int attack;
//
    int curExp; //у объектов начальное значение задать 0
    int healthMax;
    int manaMax;
    int critChance; //шанс критического урона, выставить ~10-15 в зависимости от класса, ДД можно и 20
    String[] magicSkill; //массив заклинаний
//

    public GameObject() {

    };

    public GameObject(String name,
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
        this.name = name;
        this.levelHero = levelHero;
        this.progress = progress;
        this.attribute = attribute;
        this.health = health;
        this.damage = damage;
        this.mana = mana;
        this.sinews = sinews;
        this.skill = skill;
        this.shmot = shmot;
    }

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public int getLevelHero() {
        return levelHero;
    }

    public void setLevelHero(int levelHero) {
        this.levelHero = levelHero;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String[] getAttribute() {
        return attribute;
    }

    public void setAttribute(String[] attribute) {
        this.attribute = attribute;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String[] getSinews() {
        return sinews;
    }

    public void setSinews(String[] sinews) {
        this.sinews = sinews;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    public String[] getShmot() {
        return shmot;
    }

    public void setShmot(String[] shmot) {
        this.shmot = shmot;
    }


// Marsel's methods

// Нанесение урона
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

//получение урона
    public void getDamage(int inputDamage) {
        health -= inputDamage;
        if (health < 1) {
            life = false;
        }
    }

//получение опыта
    public void expFarm(int exp) {
        curExp+=exp;
        System.out.println(name + " получил " + curExp + " ед. опыта");
        // if прописать когда опыт достиг уровн на переход след уровня

    }

//вернуть максимум здоровья
    public int getHealthMax() {
            return healthMax;
        }

    public int getManaMax() {
        return manaMax;
    }

//проверка на жив/мертв
    public boolean isAlive() {
        return life;
    }






}
