package javarpg.GamePlay;

class GameСharacters {

    protected String charClass; //класс персонажа
    protected String name; //имя
    protected int hp; //здоровье
    protected int mana; //мана
    protected int attack; //атака
    protected int defence; //защита
    protected String skills; //умения (максимум 5)

    public String getName() {
        return name;
    }

    public void Rpg (String name, String charClass) {
        this.name = name;
        this.charClass = charClass;
    }

    public void showInfo() {
    }

}
