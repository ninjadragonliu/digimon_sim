public class VaccineDigimon extends Digimon{

    public VaccineDigimon() {
        super("", "Vaccine", 10, 10, 10, 10);
    }

    @Override
    public Digimon Digivolve() {
        return new VaccineDigimon();
    }
}
