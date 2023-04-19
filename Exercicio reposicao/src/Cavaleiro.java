public class Cavaleiro extends Pessoa implements Patrulha, Consagra {
    private String casa;
    private String nomeEscudeiro;

    public Montaria montaria;

    public Cavaleiro(String nome, int idade, int honra, Arma arma, String casa, String nomeEscudeiro, Montaria montaria) {
        super(nome, idade, honra, arma);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
        this.montaria = montaria;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Casa: " + casa + "\nNome do Escudeiro: " + nomeEscudeiro);
        if(montaria!= null){
            System.out.println("Montaria: " +montaria.getNome());
        }
        else {
            System.out.println("Não possui montaria.");
        }
    }

    public void orar(){
        System.out.println(getNome() + " fez uma oração o deus do fogo.");
    }


    public void fazerPatrulha(){
        System.out.println(getNome() + " fez patrulha pelo reino.");
    }

    public void consagrarCavaleiro(){
        System.out.println(getNome() +" consagrou um novo cavaleiro.");
        setHonra(getHonra()+5);
    }
}
