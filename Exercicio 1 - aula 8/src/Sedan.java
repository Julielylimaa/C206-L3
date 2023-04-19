public class Sedan extends Carro {

    private int portaMalas;

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    public Sedan(double valor, String cor, int ano) {
        super(valor, cor, ano);
    }
    @Override
    public void taxa(){
        System.out.println("Taxa: " +getValor());
    }

    @Override
    public void mostraInfo(){
        System.out.println("Informações do Sedan: ");
        System.out.println("Valor: "+getValor() +"\nCor: " +getCor()+"\nAno: " + getAno());
        System.out.println("Porta malas: "+portaMalas);
    }

}
