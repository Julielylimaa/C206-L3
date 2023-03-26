public class Cliente {
    //atributos
    String nome;
    long cpf;
    Computador [] computador = new Computador[10];

    Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    float valor = 0f;

    //metodos
    float calculaTotalCompra(){
        for(int x = 0; x<computador.length; x++){
            if(computador[x] != null){
                valor += computador[x].preco;
            }
        }
        return valor;
    }
}