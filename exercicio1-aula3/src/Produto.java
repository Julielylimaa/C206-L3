import java.sql.SQLOutput;

public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;

    }

    void mostraInfo(){
        System.out.println("Codigo de serie: " +codigoSerie +"\nCodigo do produto: " +codigoProduto +"\nNome do material: " +nome +"\nCategoria do material: " +categoria +"\nQuantidade: "+quantidade);
    }

}
