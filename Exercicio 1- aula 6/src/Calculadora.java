public class Calculadora {
    public static double PI = 3.14;


    public static double circunferencia(double raio){

        return 2*PI*raio ;
    }

    public static double volume (double raio){
        return (PI * Math.pow(raio, 3.0)) * 4/3;
    }
}