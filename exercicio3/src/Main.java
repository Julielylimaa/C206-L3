import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha;

        do {
            System.out.println("Digite a senha: ");
            senha = entrada.nextInt();

            if (senha != 2002){
                System.out.println("Senha Invalida");
            }


        }while (senha != 2002);

        System.out.println("Acesso Permitido");
    }
}