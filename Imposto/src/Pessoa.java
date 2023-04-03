public class Pessoa {
    public static final int COMPLETO = 0;
    public static final int SIMPLIFICADO = 1;
    private String Nome;
    private String Cpf;

    public Pessoa(String nome, String cpf) {
        this.Nome = nome;
        this.Cpf = cpf;
    }

    public String RelatorioImpostoRenda(ImpostoRenda i, int tipo) {
        String temp = null;
        temp = "Dados Pessoais \n";
        temp = temp + "Nome:" + this.Nome + "\n";
        temp = temp + "Cpf:" + this.Cpf + "\n";
        temp = temp + "Dados do Calculo \n";

        if (tipo == Pessoa.COMPLETO) {
            temp = temp + "Imposto Completo \n";
            temp = temp + "Gastos Com Saúde:" + ((ImpostoCompleto) i).getGastoSaude() + "\n";
            temp = temp + "Gastos Com Educação:" + ((ImpostoCompleto) i).getGastoEducacao() + "\n";
        } else {
            temp = temp + "Imposto Simplificado \n";
        }
        temp = temp + "Renda Bruta:" + i.getRendaBruta() + "\n";
        temp = temp + "Valor a Pagar:" + i.calculo() + "\n";
        return temp;
    }

}
