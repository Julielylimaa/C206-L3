public class SUV extends Carro {
    private String tracao;
    public SUV(double valor, String cor, int ano) {
        super(valor, cor, ano);
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public void taxa(){
        System.out.println("Taxa: " +getValor());
    }

    @Override
    public void mostraInfo(){
        System.out.println("Informações do SUV: ");
        System.out.println("Valor: "+getValor() +"\nCor: " +getCor()+"\nAno: " + getAno());
        System.out.println("Tração: " +tracao);
    }
}
