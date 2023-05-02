import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Colar", 20.45);
        Produto p2 = new Produto("Brinco", 5.50);
        Produto p3 = new Produto("Pulseira", 9.40);


        Carrinho carrinhoCompras = new Carrinho();

        carrinhoCompras.addProduto(p1);
        carrinhoCompras.addProduto(p2);
        carrinhoCompras.addProduto(p3);

        System.out.println("Antes de ordenar: ");

        for(Produto prod : carrinhoCompras.getProdutos()){
            System.out.println(prod.getNome() + " Preço: " + prod.getPreco());
        }


        Collections.sort(carrinhoCompras.getProdutos());

        System.out.println("\nEm ordem crescente: ");

        for(Produto prod : carrinhoCompras.getProdutos()){
            System.out.println(prod.getNome() + " Preço: " + prod.getPreco());
        }

    }
}