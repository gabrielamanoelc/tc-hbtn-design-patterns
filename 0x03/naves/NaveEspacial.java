public class NaveEspacial {
    int saude;
    int ataque;

    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }

    public int getSaude() {
        return saude;
    }

    public int getAtaque() {
        return ataque;
    }
}
