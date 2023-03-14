public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor = new Motor();

    Carro(String cor, String marca, String modelo, double velocidadeMax, double velocidadeAtual){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
    }

    void ligar(){
        System.out.println("O carro está ligado!");
    }

    void acelerar(){
        if (velocidadeAtual + 15 < velocidadeMax){
            velocidadeAtual+=15;
            System.out.println("Velocidade atual: " +velocidadeAtual +"km/h");
        }
        else {
            velocidadeAtual = velocidadeMax;
            System.out.println("O carro atingiu a velocidade máxima. Velocidade atual = "+velocidadeAtual +"km/h");
        }
    }

    void mostraInfo(){
        System.out.println("Modelo = " +modelo +"\nMarca = " +marca +"\nCor = "+cor +"\nVelocidade maxima = " +velocidadeMax +"km/h \nVelocidade Atual = " +velocidadeAtual +"km/h");
        System.out.println("Caracteristicas do motor: \nPotencia: "+motor.potencia +"cv \nTipo: " +motor.tipo);
    }
}
