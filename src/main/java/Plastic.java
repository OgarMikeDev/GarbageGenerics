public class Plastic extends Garbage {
    public Plastic(String typeGarbage) {
        super(typeGarbage);
    }

    @Override
    public void display() {
        System.out.println("Plastic: " + getTypeGarbage());
    }
}
