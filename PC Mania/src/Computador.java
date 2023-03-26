public class Computador{
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico [] hardwareBasico = new HardwareBasico[10];
    MemoriaUSB [] memoria= new MemoriaUSB[2];


    //metodos
    void mostraPCConfigs(){
        System.out.println("\nInformações do produto: ");
        System.out.println("Marca: " +marca + "  Sistema Operacional: "+sistemaOperacional.nome +" "+ sistemaOperacional.tipo );
        for(int i = 0; i<hardwareBasico.length; i++){
            if(hardwareBasico[i]!= null){
                System.out.println(hardwareBasico[i].nome + " "+ hardwareBasico[i].capacidade);
            }
        }
        for(int i =0; i<memoria.length; i++){
            if(memoria[i]!= null){
                System.out.println("Memoria USB: " +memoria[i].nome + " "+memoria[i].capacidade);
            }
        }
        System.out.println("Preço: R$ " + preco);
    }

    void addMemoriaUSB(MemoriaUSB musb){
        for (int i = 0; i < memoria.length; i++){
            if (memoria[i] ==null){
                memoria[i] = musb;
                break;
            }
        }
    }
}