public class ImpostoSimplificado extends ImpostoRenda {

    public ImpostoSimplificado(double rendaBruta, int ano) {
        super(rendaBruta, ano);
    }

    @Override
    public double calculo() {
        return rendaBruta * 0.15;
    }

}
