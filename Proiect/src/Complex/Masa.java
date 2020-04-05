package Complex;

public class Masa {

    private int pozitie_masa;
    private boolean debarasata;

    public Masa(int pozitie_masa, boolean debarasata) {
        this.pozitie_masa = pozitie_masa;
        this.debarasata = debarasata;
    }

    public int getPozitie_masa() {
        return pozitie_masa;
    }

    public void setPozitie_masa(int pozitie_masa) {
        this.pozitie_masa = pozitie_masa;
    }

    public boolean isDebarasata() {
        return debarasata;
    }

    public void setDebarasata(boolean debarasata) {
        this.debarasata = debarasata;
    }


    @Override
    public String toString() {
        return "Masa{" +
                "pozitie_masa=" + pozitie_masa +
                ", debarasata=" + debarasata +
                '}';
    }
}
