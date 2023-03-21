public class Main {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante("012554", "rua Delfina", "Astor");

        for (int i = 0; i< restaurante.fornecedores.length; i++){
            restaurante.fornecedores[i] = new Fornecedor();
        }

        restaurante.fornecedores[0].tipo = "Bebidas";
        restaurante.fornecedores[0].quantidade = 20;


        restaurante.exibirInfos();
    }
}