public class Impressao {

    private int paginasTotais;
    int paginasColoridas;
    boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    double valorPretoBrancoFrenteVerso;

    double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal(){
        return valorColoridasFrenteVerso + valorPretoBrancoFrenteVerso + valorColoridasFrenteApenas +
                        valorPretoBrancoFrenteApenas;
    }

    @Override
    public String toString() {
        if(ehFrenteVerso){
            return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, frente e verso. " +
                    "total: R$ %.2f", paginasTotais, paginasColoridas, paginasTotais - paginasColoridas, calcularTotal());
        } else {
            return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, frente apenas. " +
                    "total: R$ %.2f", paginasTotais, paginasColoridas, paginasTotais - paginasColoridas, calcularTotal());
        }
    }
}
