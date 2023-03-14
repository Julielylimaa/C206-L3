import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Carro c1 = new Carro("Vermelho", "Chevrolet", "Camaro", 250, 0);
        Carro c2 = new Carro("Preto", "Ford", "Mustang",240, 0);
        Carro escolhido = null;
        Scanner entrada = new Scanner(System.in);

        //mostrar carros disponiveis
        System.out.println("Escolha seu carro favorito: \nCarro 1: " +c1.modelo);
        System.out.println("Carro 2: " +c2.modelo);

        System.out.println("Digite o numero do carro escolhido: ");
        int carroEscolhido= entrada.nextInt();


        //escolha do carro
        switch(carroEscolhido){
            case 1:
                escolhido = c1;
                escolhido.motor.potencia = 445;
                escolhido.motor.tipo = "V8";
                break;

            case 2:
                escolhido = c2;
                escolhido.motor.potencia = 460;
                escolhido.motor.tipo = "V8";
                break;
            default:
                System.out.println("Carro inválido!");
                System.exit(0);
        }


        System.out.println("Ligar o carro? \n0-Não ligar \n1-Ligar");
        int aux = entrada.nextInt();

        //ligar o carro
        if (aux == 1){
            escolhido.ligar();
            System.out.println("Velocidade atual: " +escolhido.velocidadeAtual +"km/h");
            do {
                System.out.println("Acelerar? \n0-Não  \n1-sim ");
                aux = entrada.nextInt();
                if (aux == 1){
                    escolhido.acelerar();
                }
                else
                    System.out.println("A Velocidade nao foi alterada. Velocidade atual = " +escolhido.velocidadeAtual +"km/h");
            }while (aux != 0);
        }


        //nao ligar o carro
        else
            System.out.println("O carro nao foi ligado!");

        escolhido.mostraInfo();

        entrada.close();


    }
}