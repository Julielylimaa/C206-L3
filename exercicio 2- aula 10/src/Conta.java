public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;


    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > (saldo + limite)) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        this.saldo -= valor;
    }
}
