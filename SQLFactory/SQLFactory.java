public class SQLFactory {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.id = 1;
        produto1.descricao = "Laranja";
        produto1.um = "KG";
        produto1.preco = 11.2;

        Boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);

        /*
         * // Produto produto1 = new Produto();
         * Database.abrirID(produto1, 5);
         * System.out.println(produto1.descricao);
         */

        /*
         * Produto produto2 = new Produto();
         * Database.abrirID(produto2, 2);
         * System.out.println(produto2.descricao);
         * 
         * Produto produto3 = new Produto();
         * Database.abrirID(produto3, 3);
         * System.out.println(produto3.descricao);
         * 
         * Produto produto4 = new Produto();
         * Database.abrirID(produto4, 4);
         * System.out.println(produto4.descricao);
         */

    }
}
