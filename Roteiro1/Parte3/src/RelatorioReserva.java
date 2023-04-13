public class RelatorioReserva {
    private IConnection Connection;

    public RelatorioReserva(IConnection connection) {
        this.Connection = connection;
    }

    public void gerarRelatorio() {
        this.Connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }
}
