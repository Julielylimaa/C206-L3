public class Aluno {
    String nome;
    int matricula;
    String curso;
    Materias [] materias = new Materias[6];
    Faculdade faculdade;

    int totalCreditos (){
        int total = 0;
        for(int i = 0; i< materias.length; i++){
            if (materias[i]!= null){
                total+= materias[i].creditos;
            }
        }
        return total;
    }

    void exibirInfos(){
        System.out.println("\nInformações do Aluno: ");
        System.out.println("Nome: "+nome + "   Matrícula: "+matricula +"\nCurso: "+curso);
        System.out.println("Matérias matriculadas: ");
        for (int i = 0; i < materias.length; i++){
            if (materias[i]!=null){
                System.out.println(materias[i].nome + "   Sigla: "+materias[i].sigla + "   Créditos: "+materias[i].creditos );
            }
        }
    }
}
