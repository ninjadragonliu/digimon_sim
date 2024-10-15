public abstract class Digimon {

    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    private int level;
    private int exp;
    private String type;

    public Digimon()
    {

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

    public abstract void Digivolve();

    public void setType(String type)
    {
        this.type = type;
    }
}
