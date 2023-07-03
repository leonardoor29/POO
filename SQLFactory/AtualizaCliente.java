public class AtualizaCliente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.id = 1;
        cliente1.Nome = "Leonardo";
        cliente1.idade = 25;

        Boolean retorno = Database.atualizairRegstro(cliente1);
        System.out.println(retorno);

    }
}
