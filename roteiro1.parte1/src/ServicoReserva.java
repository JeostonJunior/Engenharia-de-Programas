public class ServicoReserva {

    private MysqlConnection connection;

    public ServicoReserva() {
        this.connection = new MysqlConnection();
    }

    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }
}
