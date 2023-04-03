public class ImpostoCompleto extends ImpostoRenda {
    private double gastoEducacao;
    private double gastoSaude;

    public ImpostoCompleto(double rendaBruta_, int ano_, double gastoEducacao_, double gastoSaude_) {
        super(rendaBruta_, ano_);
        this.gastoEducacao = gastoEducacao_;
        this.gastoSaude = gastoSaude_;
    }

    public ImpostoCompleto(double rendaBruta_, int ano_) {
        super(rendaBruta_, ano_);
        this.gastoEducacao = rendaBruta_ * 0.1;
        this.gastoSaude = rendaBruta_ * 0.1;
    }

    public double getGastoEducacao() {
        return this.gastoEducacao;
    }

    public double getGastoSaude() {
        return this.gastoSaude;
    }

    public double calculo() {
        if (this.rendaBruta >= 100000) {
            this.valorPagar = this.rendaBruta * 0.27;
        } else if (this.rendaBruta < 50000) {
            this.valorPagar = this.rendaBruta * 0.12;
        } else {
            this.valorPagar = this.rendaBruta * 0.23;
        }

        return this.valorPagar;
    }
}