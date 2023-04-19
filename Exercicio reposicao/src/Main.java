public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma();
        Arma arma2 =  new Arma();

        arma1.setTipo("espada");
        arma2.setTipo("arco e flecha");

        Montaria montaria1 = new Montaria();
        montaria1.setNome("Maré de Ferro");

        Guarda g1 = new Guarda("Jon Snow", 25, 10, arma1, 0);
        Cavaleiro c1 = new Cavaleiro("Davos Seaworth", 49, 25, arma2, "Seaworth", "Matthos Seaworth", montaria1);
        Lorde l1 = new Lorde("Tywin Lannister", 67, 45, null, "Lannister", 12);

        Pessoa [] pessoas = new Pessoa[4];
        pessoas[0] = g1;
        pessoas[1] = c1;
        pessoas[2] = l1;


        for(int i =0; i < pessoas.length; i++){
            if(pessoas[i]!= null){
                if(pessoas[i] instanceof Guarda){
                    System.out.println("Função: Guarda");
                    ((Guarda) pessoas[i]).fazerPatrulha();
                    pessoas[i].orar();
                }
                if(pessoas[i] instanceof Cavaleiro){
                    System.out.println("Função: Cavaleiro");
                    ((Cavaleiro) pessoas[i]).fazerPatrulha();
                    ((Cavaleiro) pessoas[i]).consagrarCavaleiro();
                    pessoas[i].orar();
                }
                if(pessoas[i] instanceof Lorde){
                    System.out.println("Função: Lorde");
                    ((Lorde) pessoas[i]).consagrarCavaleiro();
                    pessoas[i].orar();
                }
                pessoas[i].mostraInfo();
                System.out.println("-----------------------------------------");
            }
        }
        System.out.println("Quantidade de pessoas: " +Pessoa.qtdPessoa);

    }
}