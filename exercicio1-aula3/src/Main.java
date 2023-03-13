public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1,"01","produto 1", "comida", 4);
        Produto p2 = new Produto(2,"02","produto 2", "bebida", 10);
        p1.mostraInfo();
        p2.mostraInfo();
    }
}