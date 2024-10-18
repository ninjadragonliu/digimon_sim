package digimons;

public abstract class Digimon {

    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    private int level;
    private int exp;
    private int nextLevelExp = 50;
    private int levelCap = 50;
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
        if(level++ >= levelCap)
        {
            level = levelCap;
            return;
        }
       this.level++;
       this.nextLevelExp = nextLevelExp * 2;
       this.exp = 0;
    }

    public void takeDamage(int damage)
    {
        this.hp -= damage;
    }
    public void gainExp(int exp)
    {
        if(exp + this.exp >= nextLevelExp && level == levelCap)
        {
            this.exp = nextLevelExp;
            return;
        }
        if(exp + this.exp >= nextLevelExp)
        {
            levelUp();
            exp = exp - nextLevelExp + this.exp;
        }
        this.exp += exp;
    }

    public abstract Digimon Digivolve();

    public void train()
    {
        this.hp += 1;
        this.attack += 1;
        this.defense += 1;
        this.speed += 1;
        System.out.println(this.name + " stats have been increased!");
    }

    public String getName() {
        return name;
    }
}
