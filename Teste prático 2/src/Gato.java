public class Gato extends Animal implements Alimentacao{
    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Gato(String nome, int idade, boolean perigoso) {
        super(nome, idade, perigoso);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Raça: "+raca);
    }

    @Override
    public String barulho() {
        return "O gato está miando";
    }

    public void correr(){
        System.out.println("O gato está correndo.");
    }

    @Override
    public void comendo() {
        System.out.println("O gato está comendo.");
    }
}
