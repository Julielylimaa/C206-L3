public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(50000, "Prata", 2022);
        SUV suv = new SUV(80000, "Azul", 2021);
        Hatch hatch = new Hatch(35000, "Vermelho", 2020);

        sedan.setPortaMalas(3);
        suv.setTracao("4x4");
        hatch.setPortas(4);

        
        sedan.mostraInfo();
        sedan.taxa();


        System.out.println();

        suv.mostraInfo();
        suv.taxa();


        System.out.println();

        hatch.mostraInfo();
        hatch.taxa();





    }
}