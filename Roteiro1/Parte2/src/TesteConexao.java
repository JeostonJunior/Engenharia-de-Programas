public class TesteConexao {
    public static void main(String[] args) {
        ServicoQuarto quarto = new ServicoQuarto();
        quarto.verificarQuarto();
        ServicoReserva reserva = new ServicoReserva();
        reserva.criarReserva();
        RelatorioReserva relatorio = new RelatorioReserva();
        relatorio.gerarRelatorio();
    }
}