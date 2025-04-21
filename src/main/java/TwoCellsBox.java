import java.util.ArrayList;

public class TwoCellsBox<T, S> extends Box {
    private ArrayList<Garbage> allItems = new ArrayList<>();
    private S secondCellBox;

    public void putItem(T firstItem, S secondItem) {
        super.putItem(firstItem);
        this.secondCellBox = secondItem;
        allItems.add((Garbage) firstItem);
        allItems.add((Garbage) secondItem);
    }

    @Override
    public ArrayList<Garbage> getItem() {
        return allItems;
    }

    public void display() {
        for (Garbage garbage : allItems) {
            garbage.display();
        }
    }
}
