public class Paper extends Garbage {
    public Paper(String typeGarbage) {
        super(typeGarbage);
    }

    @Override
    public String display() {
        return "Paper: " + getTypeGarbage();
    }
}
