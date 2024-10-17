public class Tamer {
    private String name;
    private int tamerLevel;
    private int exp;
    private int nextLevelExp = 50;
    private int levelCap = 10;

    public int getTamerLevel() {
        return tamerLevel;
    }

    public void setTamerLevel(int tamerLevel) {
        this.tamerLevel = tamerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void levelUp()
    {
        if(tamerLevel++ >= levelCap)
        {
            tamerLevel = levelCap;
            return;
        }
        this.tamerLevel++;
        this.exp = 0;
        this.nextLevelExp = nextLevelExp * 2;
    }

    public void gainExp(int exp)
    {
        if(exp + this.exp >= nextLevelExp && tamerLevel == levelCap)
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
}
