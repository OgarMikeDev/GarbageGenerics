import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Plastic firstPartPlastic = new Plastic("Полиэтилен"); //Пакет

        Glass firstPartGlass = new Glass("Армированное"); //Усиленное окно

        Paper firstPartPaper = new Paper("Газетная бумага"); //Газета

        Box<Plastic> boxForPlastic = new Box<>();
        boxForPlastic.putItem(firstPartPlastic);
        boxForPlastic.getItem();
        boxForPlastic.display();

        Box<Glass> boxForGlass = new Box<>();
        boxForGlass.putItem(firstPartGlass);
        boxForGlass.getItem();
        boxForGlass.display();

        Box<Paper> boxForPaper = new Box<>();
        boxForPaper.putItem(firstPartPaper);
        boxForPaper.getItem();
        boxForPaper.display();

        TwoCellsBox<Plastic, Glass> boxForPlasticAndGlass = new TwoCellsBox<>();
        boxForPlasticAndGlass.putItem(firstPartPlastic, firstPartGlass);
        boxForPlasticAndGlass.getItem();
        boxForPlasticAndGlass.display();
    }
}
