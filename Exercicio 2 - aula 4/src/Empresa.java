public class Empresa {
    String cnpj;
    String endereco;
    Contato [] contatos = new Contato[10];


    Empresa(String cnpj, String endereco){
        this.cnpj = cnpj;
        this.endereco = endereco;
    }


    void exibirInfos(){
        System.out.println("\nDados da Empresa:" +"\nCnpj: "+cnpj + "  Endereço: "+endereco +"\nContatos da empresa: ");
        for (int i=0; i<contatos.length; i++){
            if (contatos[i] != null){
                System.out.println("\nContato "+(i+1) +": \nNome: "+contatos[i].nome +"\nEmail: "+contatos[i].email + "\nTelefone: "+contatos[i].telefone +"\nData de Nascimento: "+contatos[i].dataNascimento);
            }
        }
    }
}
