public class Cliente extends SQLClass {

    @Key
    int id;

    String Nome;
    Integer idade;

    Cliente() {
        this.setTableName("Clientes");
    }

    public void printObject() {
        System.out.println(
                this.id + ", " +
                        this.Nome + ", " +
                        this.idade + ", "

        );
    }
}
