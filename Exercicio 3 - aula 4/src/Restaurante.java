public class Restaurante{
    String cnpj;
    String endereco;
    String nome;
    Fornecedor [] fornecedores = new Fornecedor[5];



    Restaurante(String cnpj, String endereco, String nome){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
    }

    void exibirInfos(){
        System.out.println("Restaurante "+nome +"\nEndereço: "+endereco +"  Cnpj: "+cnpj);
        for (int i = 0; i < fornecedores.length; i++){
            if(fornecedores[i].tipo != null){
                System.out.println("\nFornecedor " +(i+1));
                System.out.println("Tipo: "+fornecedores[i].tipo +"   Quantidade: " +fornecedores[i].quantidade);
            }
        }
    }
}