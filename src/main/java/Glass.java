public class Glass extends Garbage {
    public Glass(String typeGarbage) {
        super(typeGarbage);
    }

    @Override
    public void display() {
        System.out.println("Glass: " + getTypeGarbage());
    }
}
