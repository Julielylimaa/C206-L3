public class Faculdade {
    String nome;
    String cnpj;

    Faculdade(String nome, String cnpj){
        this.nome= nome;
        this.cnpj = cnpj;
    }
    void exibirInfos(){
        System.out.println("Informações da Faculdade:\nNome: " +nome + "  Cnpj: "+cnpj);
    }
}
