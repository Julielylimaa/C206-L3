
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = entrada.nextDouble();

        double imc;

        imc = peso / Math.pow(altura, 2.0);

        System.out.println(imc);
        if (imc < 18.5)
            System.out.println("abaixo do peso");
        else if (imc < 24.9)
            System.out.println("Peso ideal (parabéns)");
        else if (imc <29.9)
            System.out.println("Levemente acima do peso");
        else if (imc <34.9)
            System.out.println("Obesidade grau I");
        else if (imc <39.9 )
            System.out.println("Obesidade grau II");
        else
            System.out.println("Obesidade III (mórbida)");

        entrada.close();
    }

}