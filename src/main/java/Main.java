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
        System.out.println("Первая партия мусора " + boxForPlastic.getItem().display());

        Box<Glass> boxForGlass = new Box<>();
        boxForGlass.putItem(firstPartGlass);
        System.out.println("Вторая партия мусора " + boxForGlass.getItem().display());

        Box<Paper> boxForPaper = new Box<>();
        boxForPaper.putItem(firstPartPaper);
        System.out.println("Третья партия мусора " + boxForPaper.getItem().display());
    }
}
