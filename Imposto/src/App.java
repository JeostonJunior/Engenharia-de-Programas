public class App {
    public static void main(String args[]) {
        Pessoa p = new Pessoa("Eduardo Jorge", "88777008-45");
        ImpostoRenda i = new ImpostoCompleto(100000, 2005, 2600, 10000);
        i.processamento(2005);
        System.out.println(p.RelatorioImpostoRenda(i, Pessoa.COMPLETO));
        Pessoa p1 = new Pessoa("Camila Silva", "900007008-21");
        ImpostoRenda i1 = new ImpostoSimplificado(50000, 2005);
        i1.processamento(2005);
        System.out.println(p1.RelatorioImpostoRenda(i1, Pessoa.SIMPLIFICADO));
    }
}
