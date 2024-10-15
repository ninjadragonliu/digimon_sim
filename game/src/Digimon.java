public abstract class Digimon {

    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    private int level;
    private int exp;
    private DigimonTypes type;

    public Digimon(String name, DigimonTypes type, int hp, int attack, int defense, int speed)
    {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.level = 1;
        this.exp = 0;

    }

    public void attack()
    {

    }

    public void defend()
    {

    }

    public void levelUp()
    {

    }

    public void takeDamage(int damage)
    {

    }

    public abstract Digimon Digivolve();

}
