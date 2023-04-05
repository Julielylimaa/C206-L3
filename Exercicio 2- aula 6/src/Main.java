public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Aline");
        cliente1.setCpf(254884);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Marcos");
        cliente2.setCpf(254264);


        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);

        conta1.deposita(200);
        conta1.saca(20);
        conta1.extrato();

        conta2.deposita(250);
        conta2.saca(45);
        conta2.extrato();


        System.out.println("\nQuantidade de clientes: " +Conta.getQtdClientes());






    }
}