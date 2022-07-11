public class ImpressaoFactory {

   public static Impressao createImpressao(TamanhoImpressao tamanho, int TotalPages, int QuantidadePaginasColoridas, boolean ehFrenteVerso){
        
        Impressao impressao = new Impressao();
        
        if(ehFrenteVerso){
            impressao.setEhFrenteVerso(true);
            if(tamanho.equals(TamanhoImpressao.A2)){
                impressao.paginasColoridas = QuantidadePaginasColoridas;
                impressao.setPaginasTotais(TotalPages);
                impressao.setValorColoridasFrenteVerso(QuantidadePaginasColoridas * 0.28);
                impressao.valorPretoBrancoFrenteVerso = (TotalPages - QuantidadePaginasColoridas) * 0.18;
            } else if (tamanho.equals(TamanhoImpressao.A3)) {
                impressao.paginasColoridas = QuantidadePaginasColoridas;
                impressao.setPaginasTotais(TotalPages);
                impressao.setValorColoridasFrenteVerso(QuantidadePaginasColoridas * 0.25);
                impressao.valorPretoBrancoFrenteVerso = (TotalPages - QuantidadePaginasColoridas) * 0.15;
            } else if (tamanho.equals(TamanhoImpressao.A4)) {
                impressao.paginasColoridas = QuantidadePaginasColoridas;
                impressao.setPaginasTotais(TotalPages);
                impressao.setValorColoridasFrenteVerso(QuantidadePaginasColoridas * 0.20);
                impressao.valorPretoBrancoFrenteVerso = (TotalPages - QuantidadePaginasColoridas) * 0.10;
            }
        } else {
            impressao.setEhFrenteVerso(false);
            if (tamanho.equals(TamanhoImpressao.A2)){
                impressao.paginasColoridas = QuantidadePaginasColoridas;
                impressao.setPaginasTotais(TotalPages);
                impressao.valorColoridasFrenteApenas = QuantidadePaginasColoridas * 0.32;
                impressao.setValorPretoBrancoFrenteApenas((TotalPages - QuantidadePaginasColoridas) * 0.22);
            } else if (tamanho.equals(TamanhoImpressao.A3)) {
                impressao.paginasColoridas = QuantidadePaginasColoridas;
                impressao.setPaginasTotais(TotalPages);
                impressao.valorColoridasFrenteApenas = QuantidadePaginasColoridas * 0.30;
                impressao.setValorPretoBrancoFrenteApenas((TotalPages - QuantidadePaginasColoridas) * 0.20);
            } else if (tamanho.equals(TamanhoImpressao.A4)) {
                impressao.paginasColoridas = QuantidadePaginasColoridas;
                impressao.setPaginasTotais(TotalPages);
                impressao.valorColoridasFrenteApenas = QuantidadePaginasColoridas * 0.25;
                impressao.setValorPretoBrancoFrenteApenas((TotalPages - QuantidadePaginasColoridas) * 0.15);
            }
        }

        return impressao;
        
    }
}
