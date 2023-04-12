public class Main {
    public static void main(String[] args) {

        Produto [] produtos = new Produto[5];
        produtos[0] = new Notebook("Notebook Dell", 3500.0, 512, "Nvidia GeForce GTX 1650", "Intel Core i5");
        produtos[1] = new Camiseta("Camiseta Adidas", 79.9, "Branca", "M");


        for (int i = 0; i< produtos.length; i++){
            if(produtos[i]!= null){
                if(produtos[i] instanceof Notebook){
                    Notebook n = (Notebook) produtos[i];
                    System.out.println(n.etiquetaPreco());
                }
                else if(produtos[i] instanceof Camiseta){
                    Camiseta c = (Camiseta) produtos[i];
                    System.out.println(c.etiquetaPreco());
                }

                System.out.println("----------------------------");
            }
        }

    }
}