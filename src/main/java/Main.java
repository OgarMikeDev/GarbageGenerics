public class Main {
    public static void main(String[] args) {
        Plastic firstPartPlastic = new Plastic("Полиэтилен"); //Пакет
        Plastic secondPartPlastic = new Plastic("Полистирол"); //Корпус

        Glass firstPartGlass = new Glass("Армированное"); //Усиленное окно
        Glass secondPartGlass = new Glass("Сталинит"); //Защитное стекло на телефон

        Box<Plastic> boxForPlastic = new Box<>();
        boxForPlastic.putItem(firstPartPlastic);
        System.out.println("Первая партия мусора " + boxForPlastic.getItem().display());

        Box<Glass> boxForGlass = new Box<>();
        boxForGlass.putItem(firstPartGlass);
        System.out.println("Вторая партия мусора " + boxForGlass.getItem().display());

    }
}
