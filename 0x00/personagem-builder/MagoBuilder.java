public class MagoBuilder implements Builder {

    private String nome;
    private TipoPersonagem tipoPersonagem;
    private int forca;
    private int inteligencia;
    private int vigor;
    private int resistencia;
    private int destreza;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipoPersonagem = tipo;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Mago build(){
        return new Mago(nome, inteligencia, forca, vigor, resistencia, destreza);
    }


}
