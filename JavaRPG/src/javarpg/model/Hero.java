package javarpg.model;

import javarpg.model.GameCharater;

public class Hero extends GameCharater {

    public Hero (String charClass, String name, int hp, int mana, int attack, int defence, String skills) {
        super(charClass, name);
        this.hp = hp;
        this.mana = mana;
        this.attack = attack;
        this.defence = defence;
        this.skills = skills;


    }
}
