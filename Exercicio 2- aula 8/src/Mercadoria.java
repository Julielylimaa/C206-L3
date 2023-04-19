public abstract class Mercadoria {
    private int codigo;
    private String fabricante;
    private String descricao;
    private double valor;

    public Mercadoria(int codigo, String fabricante, String descricao, double valor) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.valor = valor;
    }
}
