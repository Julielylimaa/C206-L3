public class Main {
    public static void main(String[] args){
        Carrinho carrinho = new Carrinho(0);
        carrinho.produtos[0] = new Produto("Jaqueta", "Jaqueta tradicional confeccionada em moletom flanelado e malha relevo leve. \nPossui decote redondo com capuz forrado, bolsos frontais e manga longa com punho. \nAposte com camiseta estampada, calça jogging e tênis! ", "Malwee", 149.99);
        carrinho.produtos[1] = new Produto("Livro: O Colecionador", " Essa obra-prima lançada em 1963 continua perigosamente atual.\nBest-seller internacional, e ainda um sucesso de venda nos sebos após décadas fora de catálogo no Brasil, o grande romance de estreia de John Fowles está de volta com uma edição digna de colecionador, \ne aquele padrão de qualidade psicopata que só a DarkSide® Books tem. ", "Darkside", 35.90);

        carrinho.calculaTotal();
        carrinho.exibirInfos();


    }
}