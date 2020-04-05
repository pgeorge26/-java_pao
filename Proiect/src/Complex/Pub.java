package Complex;

public class Pub extends Masa {

    private int numar_mese;

    public Pub(int pozitie_masa, boolean debarasata, int numar_mese) {
        super(pozitie_masa, debarasata);
        this.numar_mese = numar_mese;
    }

    public int getNumar_mese() {
        return numar_mese;
    }

    public void setNumar_mese(int numar_mese) {
        this.numar_mese = numar_mese;
    }
}
