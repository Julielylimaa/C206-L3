public class Zoo {
    private String nome;
    private String endereco;
    private long cnpj;
    public Animal[] animais;


    public Zoo(String nome, String endereco, long cnpj, Animal[] animais) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.animais = animais;
    }

    public void mostraInfo(){
        System.out.println("Informações do " + nome +": ");
        System.out.println(endereco +"  Cnpj: " +cnpj);
        System.out.println("Quantidade de animais: " + Animal.qntAnimais);

        System.out.println("\nInformações dos animais: ");

        for(int i= 0; i< animais.length; i++){
            if(animais[i]!= null){
                if(animais[i] instanceof Leao){
                    System.out.println("Especie: Leão");
                    animais[i].mostraInfo();
                    animais[i].barulho();
                    ((Leao) animais[i]).dormir();
                }
                else if(animais[i] instanceof Coruja){
                    System.out.println("Especie: Coruja");
                    animais[i].mostraInfo();
                    animais[i].barulho();
                    ((Coruja) animais[i]).comendo();
                    ((Coruja) animais[i]).voar();
                }
                else if (animais[i] instanceof Gato){
                    System.out.println("Especie: Gato");
                    animais[i].mostraInfo();
                    ((Gato) animais[i]).comendo();
                    animais[i].barulho();
                    ((Gato) animais[i]).correr();
                }

                System.out.println();
            }
        }
    }
}
