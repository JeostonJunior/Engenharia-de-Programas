public class ServicoReserva {
    private IConnection Connection;

    public ServicoReserva(IConnection connection) {
        this.Connection = connection;
    }

    public void criarReserva() {
        this.Connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }
}
