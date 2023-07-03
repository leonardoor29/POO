public class InformacaoCliente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        Boolean retorno = Database.abrirID(cliente1, 1);

        System.out.println("ID: " + cliente1.id);
        System.out.println("Nome: " + cliente1.Nome);
        System.out.println("Idade: " + cliente1.idade);

    }
}
