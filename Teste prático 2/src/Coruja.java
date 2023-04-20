public class Coruja extends Animal implements Alimentacao{
    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Coruja(String nome, int idade, boolean perigoso) {
        super(nome, idade, perigoso);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+ cor);
    }

    @Override
    public String barulho() {
        return "A coruja está fazendo barulho.";
    }

    public void voar(){
        System.out.println("A coruja está voando.");
    }

    @Override
    public void comendo() {
        System.out.println("A coruja está comendo.");
    }
}
