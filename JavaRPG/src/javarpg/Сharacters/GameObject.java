package javarpg.Сharacters;
import javarpg.GamePlay.*;


import java.util.Arrays;

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
    int life;
    boolean isAlive;
    int[] levelHero;
    int progress;
    String[] attribute;

    int health;
    int damage;
    int mana;
    String[] sinews;
    String[] skill;
    String[] shmot;
    int attack;

    public GameObject(String name,
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
        this.name = name;
        this.life = life;
        this.isAlive = isAlive;
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int[] getLevelHero() {
        return levelHero;
    }

    public void setLevelHero(int[] levelHero) {
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

    public int makeAttack () {
        int minAttack = (int)(attack * 0.9f);
        int deltaAttack = (int)(attack * 0.2f);
        int curAttack = minAttack + (GamePlay.random.nextInt(deltaAttack));
        return curAttack;
    }
}
