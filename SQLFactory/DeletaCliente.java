public class DeletaCliente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.id = 1;

        Boolean retorno = Database.deletarRegistro(cliente1);
        System.out.println(retorno);

    }
}
