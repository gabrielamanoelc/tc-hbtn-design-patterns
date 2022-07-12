public class NaveEspacialDecorator extends NaveEspacial {
    NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.naveDecorada = naveEspacial;
    }

    @Override
    public int getSaude() {
        return super.getSaude();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }
}
