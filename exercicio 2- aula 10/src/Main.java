public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(123, "João", 125.30, 30);

        try{
            conta.sacar(500);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo: "+ conta.getSaldo());
    }
}