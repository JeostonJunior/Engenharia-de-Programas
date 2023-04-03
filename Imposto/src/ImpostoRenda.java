public abstract class ImpostoRenda {
    protected double valorPagar;
    protected double rendaBruta;
    protected int ano;

    public ImpostoRenda(double rendaBruta_, int ano_) {
        rendaBruta = rendaBruta_;
        ano = ano_;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public int getAno() {
        return ano;
    }

    public abstract double calculo();

    public boolean processamento(int anoBase) {
        if (anoBase == ano && rendaBruta > 12000) {
            valorPagar = calculo();
            return true;
        } else {
            return false;
        }
    }
}