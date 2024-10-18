package digimons;

public class Agumon extends Digimon{
    public Agumon() {
        super("Agumon", DigimonTypes.VACCINE, 100, 30, 25, 25);
    }

    @Override
    public Digimon Digivolve() {
        return null;
    }
}
