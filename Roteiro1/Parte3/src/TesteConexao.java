public class TesteConexao {
    public static void main(String[] args) {
        ServicoQuarto quarto = new ServicoQuarto(new SqlServerConnection());
        quarto.verificarQuarto();
        ServicoReserva reserva = new ServicoReserva(new SqlServerConnection());
        reserva.criarReserva();
        RelatorioReserva relatorio = new RelatorioReserva(new SqlServerConnection());
        relatorio.gerarRelatorio();
    }
}