import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Cliente cliente = new Cliente("João da Silva", 145945132);//informações do cliente
        int promocao; //escolha do usuario
        MemoriaUSB musb;
        Computador[] promocoes = new Computador[4];

        promocoes[1] = new Computador();
        promocoes[1].marca = "Positivo";
        promocoes[1].preco = 2300f;
        promocoes[1].hardwareBasico[0] = new HardwareBasico("Processador Core i3", 2200);
        promocoes[1].hardwareBasico[1] = new HardwareBasico("Memória RAM", 8);
        promocoes[1].hardwareBasico[2] = new HardwareBasico("HD", 500);
        promocoes[1].sistemaOperacional = new SistemaOperacional("Linux Ubuntu", 32);
        musb = new MemoriaUSB("Pen-drive", 16);
        promocoes[1].addMemoriaUSB(musb);

        promocoes[2] = new Computador();
        promocoes[2].marca = "Acer";
        promocoes[2].preco = 5800f;
        promocoes[2].hardwareBasico[0] = new HardwareBasico("Processador Core i5", 3370);
        promocoes[2].hardwareBasico[1] = new HardwareBasico("Memória RAM", 16);
        promocoes[2].hardwareBasico[2] = new HardwareBasico("HD", 1);
        promocoes[2].sistemaOperacional = new SistemaOperacional("Windows 8", 64);
        musb = new MemoriaUSB("Pen-drive", 32);
        promocoes[2].addMemoriaUSB(musb);

        promocoes[3] = new Computador();
        promocoes[3].marca = "Vaio";
        promocoes[3].preco = 1800f;
        promocoes[3].hardwareBasico[0] = new HardwareBasico("Processador Core i7", 4500);
        promocoes[3].hardwareBasico[1] = new HardwareBasico("Memória RAM", 32);
        promocoes[3].hardwareBasico[2] = new HardwareBasico("HD", 2);
        promocoes[3].sistemaOperacional = new SistemaOperacional("Windows 10", 64);
        musb = new MemoriaUSB("HD externo", 1);
        promocoes[3].addMemoriaUSB(musb);

        cliente.computador[0] = new Computador();
        cliente.computador[0].sistemaOperacional = new SistemaOperacional(null, 0);


        Scanner entrada = new Scanner(System.in);
        System.out.println("Compra iniciada!");


        System.out.println("\nPromoção 1: ");
        promocoes[1].mostraPCConfigs();
        System.out.println("\nPromoção 2: ");
        promocoes[2].mostraPCConfigs();
        System.out.println("\nPromoção 3: ");
        promocoes[3].mostraPCConfigs();


        System.out.println("Escolha a promoção desejada:");
        promocao = entrada.nextInt();

        int i = 0;

        while(promocao != 0){

            switch(promocao){
                case 1:
                    //informações promoçao 1
                    cliente.computador[i] = new Computador();
                    cliente.computador[i] = promocoes[1];
                    break;


                case 2:
                    //informações promoçao 2
                    cliente.computador[i] = new Computador();
                    cliente.computador[i] = promocoes[2];
                    break;

                case 3:
                    //informações promoçao 3
                    cliente.computador[i] = new Computador();
                    cliente.computador[i] = promocoes[3];
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
            i++;

            System.out.println("Para continuar comprando, digite o código da promoção desejada! Para sair digite '0'.");
            promocao = entrada.nextInt();
        }

        System.out.println("--------------------------------------------");
        System.out.println("Compra finalizada!");
        System.out.println("\nDados do cliente: \nNome: "+cliente.nome + "    Cpf: " +cliente.cpf);
        System.out.println("\nDados da compra: ");
        for(int x = 0; x<cliente.computador.length; x++){
            if(cliente.computador[x] != null){
                cliente.computador[x].mostraPCConfigs();
            }
        }

        System.out.println(String.format("Valor total da compra: R$ %.2f", cliente.calculaTotalCompra()));
        entrada.close();


    }
}