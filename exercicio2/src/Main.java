import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os dois numeros:");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();

        System.out.println("Digite a operação que deseja realizar: \n" +
                "1 - Soma;\n2 - Subtração;\n3 - Multiplicação;\n4 - Divisão.");



        int operacao = entrada.nextInt();
        switch (operacao){

            case 1:
                System.out.println(n1+n2) ;
                break;
            case 2:
                System.out.println(n1-n2);
                break;

            case 3:
                System.out.println(n1*n2);
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        entrada.close();
    }
}