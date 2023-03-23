public class Main {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[6];
        Faculdade facu = new Faculdade("Inatel","0000000000");
        aluno[0] = new Aluno();
        aluno[0].materias[0] = new Materias();
        aluno[0].materias[1] = new Materias();
        aluno[0].materias[2] = new Materias();
        aluno[1] = new Aluno();
        aluno[1].materias[0] = new Materias();
        aluno[1].materias[1] = new Materias();
        aluno[1].materias[2] = new Materias();


        //informaçoes aluno 1
        aluno[0].faculdade = facu;
        aluno[0].nome = "Joao Victor";
        aluno[0].matricula = 1791;
        aluno[0].curso = "Egenharia de Computação";

        aluno[0].materias[0].nome = "Física 1";
        aluno[0].materias[0].sigla = "F201";
        aluno[0].materias[0].creditos = 3;
        aluno[0].materias[1].nome = "Calculo 1";
        aluno[0].materias[1].sigla = "M002";
        aluno[0].materias[1].creditos = 4;
        aluno[0].materias[2].nome = "Circuitos Elétricos 1";
        aluno[0].materias[2].sigla = "E201";
        aluno[0].materias[2].creditos = 2;

        //informações aluno 2
        aluno[1].faculdade = facu;
        aluno[1].nome = "Anna Carla";
        aluno[1].matricula = 400;
        aluno[1].curso = "Egenharia de Software";
        aluno[1].materias[0].nome = "Banco de Dados";
        aluno[1].materias[0].sigla = "C207";
        aluno[1].materias[0].creditos = 3;
        aluno[1].materias[1].nome = "Eletronica Digital 2";
        aluno[1].materias[1].sigla = "E202";
        aluno[1].materias[1].creditos = 3;
        aluno[1].materias[2].nome = "Matemática Discreta";
        aluno[1].materias[2].sigla = "M020";
        aluno[1].materias[2].creditos = 1;

        facu.exibirInfos();
        for (int i = 0; i< aluno.length; i++){
            if (aluno[i] != null){
                aluno[i].exibirInfos();
                System.out.println("Total de créditos do aluno: " + aluno[i].totalCreditos());
            }
        }
    }
}