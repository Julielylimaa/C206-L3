public class Carrinho {
    double total;
    Produto [] produtos = new Produto[10];


    void exibirInfos(){
        if(total == 0){
            System.out.println("Seu carrinho está vazio!");
        }
        else{

            System.out.println("\nInformações dos Produtos: ");
            for(int i = 0; i<produtos.length; i++){
                if(produtos[i]!= null){
                    System.out.println("\n" +produtos[i].nome +"\nFabricante: "+produtos[i].fabricante + "   Preço: "+produtos[i].preco + "\nDescrição: " +produtos[i].descricao);
                    System.out.println("--------------------------------------------------------------------------");
                }
            }

        }
    }

    double calculaTotal(){

        for(int i = 0; i<produtos.length; i++){
            if(produtos[i]!= null){
                total+= produtos[i].preco;
            }
        }
        return total;
    }
}