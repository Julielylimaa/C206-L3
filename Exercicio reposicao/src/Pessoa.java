public abstract class Pessoa {
    public static int qtdPessoa;
    private String nome;
    private int idade;
    private int honra;
    public Arma arma;

    public Pessoa(String nome, int idade, int honra, Arma arma) {
        this.nome = nome;
        this.idade = idade;
        this.honra = honra;
        this.arma = arma;

        qtdPessoa++;
    }

    public void  mostraInfo(){
        System.out.println("Nome: " + nome + "\nIdade: "+ idade +" anos \nHonra: "+ honra);
        if(arma != null){
            System.out.println("Arma: " + arma.getTipo());
        }
        else{
            System.out.println("Não possui arma.");
        }

    }

    public abstract void orar();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public int getHonra() {
        return honra;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }
}
