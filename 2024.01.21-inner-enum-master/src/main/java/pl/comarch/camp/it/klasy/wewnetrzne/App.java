package pl.comarch.camp.it.klasy.wewnetrzne;

public class App {
    public static void main(String[] args) {
        Zewnetrzna zewnetrzna = new Zewnetrzna();
        zewnetrzna.x = 5;
        zewnetrzna.metoda();

        Zewnetrzna.y = 7;

        //Zewnetrzna.Wewnetrzna obiekt = zewnetrzna.new Wewnetrzna();
        Zewnetrzna.Wewnetrzna obiekt2 = new Zewnetrzna.Wewnetrzna();
    }
}
