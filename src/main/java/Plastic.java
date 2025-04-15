public class Plastic extends Garbage {
    public Plastic(String typeGarbage) {
        super(typeGarbage);
    }

    @Override
    public String display() {
        return "Plastic: " + getTypeGarbage();
    }
}
