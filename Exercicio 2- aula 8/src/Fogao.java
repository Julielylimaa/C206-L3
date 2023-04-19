public class Fogao extends Mercadoria{
    private int quantidadeBocas;
    private String tipoAcendimento;

    public Fogao(int codigo, String fabricante, String descricao, double valor, int quantidadeBocas, String tipoAcendimento) {
        super(codigo, fabricante, descricao, valor);
        this.quantidadeBocas = quantidadeBocas;
        this.tipoAcendimento = tipoAcendimento;
    }
}
