public class Paper extends Garbage {
    public Paper(String typeGarbage) {
        super(typeGarbage);
    }

    @Override
    public void display() {
        System.out.println("Paper: " + getTypeGarbage());
    }
}
