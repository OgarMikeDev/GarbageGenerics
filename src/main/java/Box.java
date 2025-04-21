public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void putItem(T item) {
        this.item = item;
    }

    public void display() {
        Garbage garbage = (Garbage) item;
        garbage.display();
    }
}
