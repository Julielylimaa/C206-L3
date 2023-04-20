public abstract class Animal {
    public static int qntAnimais;
    private String nome;
    private int idade;
    private boolean perigoso;


    public Animal(String nome, int idade, boolean perigoso) {
        this.nome = nome;
        this.idade = idade;
        this.perigoso = perigoso;

        qntAnimais++;
    }

    public void mostraInfo(){
        System.out.println("Nome: " +nome +"\nIdade: " +idade);
        if(perigoso){
            System.out.println("É perigoso!");
        }
        else{
            System.out.println("Não é perigoso!");
        }

    }

    public abstract String barulho();
}
