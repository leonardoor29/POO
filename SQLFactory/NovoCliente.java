public class NovoCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.id = 6;
        cliente1.Nome = "tata";
        cliente1.idade = 30;

        Boolean retorno = Database.inserirRegistro(cliente1);
        System.out.println(retorno);

    }
}
