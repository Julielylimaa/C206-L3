import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio da esfera: ");
        double raio = entrada.nextDouble();


        System.out.println(String.format ("Circunferencia: %.2f",Calculadora.circunferencia(raio) ));
        System.out.println(String.format ("Volume: %.2f",Calculadora.volume(raio) ));


        entrada.close();
    }
}

