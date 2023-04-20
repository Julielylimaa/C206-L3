public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        Leao leao = new Leao("Leo", 12, true);
        Coruja coruja = new Coruja("Luna", 5, false);
        Gato gato = new Gato("Sagwa", 7, false);

        leao.setTamanhoJuba(15.4f);
        coruja.setCor("Branco");
        gato.setRaca("Siames");

        animais[0] = leao;
        animais[1] = coruja;
        animais[2] = gato;

        Zoo zoo = new Zoo("Zoo de Santa Rita", "Rua Central, 15", 10002, animais);

        zoo.mostraInfo();


    }
}