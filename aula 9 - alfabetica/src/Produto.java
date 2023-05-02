public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto o) {
        return this.getNome().compareTo(o.getNome());
    }


}