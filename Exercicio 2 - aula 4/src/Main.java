public class Main {
    public static void main(String[] args){
        Empresa empresa = new Empresa("123456", "Vale do Silicio");
        empresa.contatos[0] = new Contato("contato 1", "contato1@gmail.com", "(35)999659856", "21/04/1996");
        empresa.contatos[1] = new Contato("contato 2", "contato2@gmail.com", "(35)994785514", "15/06/1998");
        empresa.contatos[2] = new Contato("contato 3", "contato3@gmail.com", "(35)988579641", "29/03/1999");
        empresa.exibirInfos();

    }
}