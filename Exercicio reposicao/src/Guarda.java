public class Guarda extends Pessoa implements Patrulha {
    private int coragem;

    public Guarda(String nome, int idade, int honra, Arma arma, int coragem) {
        super(nome, idade, honra, arma);
        this.coragem = coragem;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Coragem: "+coragem);
    }


    public void orar(){
        System.out.println(getNome() + " fez uma oração aos deuses antigos.");
    }


    public void fazerPatrulha() {
        System.out.println(getNome() + " fez uma patrulha além da muralha");
        coragem+= 20;
    }
}
