public class Hatch extends Carro {
    private int portas;
    public Hatch(double valor, String cor, int ano) {
        super(valor, cor, ano);
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void taxa(){
        System.out.println("Taxa: " +getValor());
    }

    @Override
    public void mostraInfo(){
        System.out.println("Informações do Hatch: ");
        System.out.println("Valor: "+getValor() +"\nCor: " +getCor()+"\nAno: " + getAno());
        System.out.println("Portas: " + portas);
    }
}
