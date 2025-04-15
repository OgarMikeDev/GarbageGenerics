public class Glass extends Garbage {
    public Glass(String typeGarbage) {
        super(typeGarbage);
    }

    @Override
    public String display() {
        return "Glass: " + getTypeGarbage();
    }
}
