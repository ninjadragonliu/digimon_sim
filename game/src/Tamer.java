public class Tamer {
    private String name;
    private int tamerLevel;
    private int exp;
    private int nextLevelExp = 50;

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
        this.tamerLevel++;
        this.exp = 0;
        this.nextLevelExp = nextLevelExp * 2;
    }
}
