public class Lorde extends Pessoa implements Consagra{
    private String casa;
    private int qtdVassalos;


    public Lorde(String nome, int idade, int honra, Arma arma, String casa, int qtdVassalos) {
        super(nome, idade, honra, arma);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Casa: " + casa + "\nQuantidade de vassalos: "+ qtdVassalos);

    }

    public void orar(){
        System.out.println(getNome() + " fez uma oração aos sete deuses.");
    }

    public void consagrarCavaleiro(){
        System.out.println(getNome() + " consagrou  um  novo cavaleiro.");
        qtdVassalos++;
    }
}
