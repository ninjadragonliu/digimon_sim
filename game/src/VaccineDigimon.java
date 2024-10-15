public class VaccineDigimon extends Digimon{

    public VaccineDigimon() {
        super(name, "Vaccine", hp, attack, defense, speed);
    }

    @Override
    public Digimon Digivolve() {
        return new VaccineDigimon();
    }
}
