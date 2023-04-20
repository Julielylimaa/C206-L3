public class Leao extends Animal {
    private float tamanhoJuba;

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    public Leao(String nome, int idade, boolean perigoso) {
        super(nome, idade, perigoso);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tamanho da juba: " +tamanhoJuba);

    }

    @Override
    public String barulho() {
        return "O leão está rugindo.";
    }

    public void dormir(){
        System.out.println("O leão está dormindo.");
    }
}
