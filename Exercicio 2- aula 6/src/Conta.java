public class Conta {
    private static int qtdClientes;
    private double saldo;
    Cliente cliente;

    Conta(Cliente cliente){
        qtdClientes++;
        this.cliente = cliente;
    }


    public static int getQtdClientes() {
        return qtdClientes;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public void saca (double valor){
        if(saldo >= valor){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void extrato(){
        System.out.println("Nome do cliente: "+cliente.getNome() +"\nCPF: " +cliente.getCpf());
        System.out.println("Saldo da conta: " + saldo);
    }
}
