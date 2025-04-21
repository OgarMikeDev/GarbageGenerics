public abstract class Garbage {
    private String typeGarbage;

    public Garbage(String typeGarbage) {
        this.typeGarbage = typeGarbage;
    }

    public void defineTypeGarbage(String typeGarbage) {
        this.typeGarbage = typeGarbage;
    }

    public String getTypeGarbage() {
        return typeGarbage;
    }

    public abstract void display();
}
