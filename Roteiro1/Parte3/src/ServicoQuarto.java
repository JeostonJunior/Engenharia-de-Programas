public class ServicoQuarto {
    private IConnection Connection;

    public ServicoQuarto(IConnection connection) {
        this.Connection = connection;
    }

    public void verificarQuarto() {
        this.Connection.connect();
        System.out.println("Lógica de negócio para o Serviço de Quarto");
    }
}
