import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Meniu   {

    private String numeMancare;
    private  int pret;
    private  int cantitate;

    public Meniu(String numeMancare, int pret, int cantitate) {
        this.numeMancare = numeMancare;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String getNumeMancare() {
        return numeMancare;
    }

    public void setNumeMancare(String numeMancare) {
        this.numeMancare = numeMancare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "{" +
                "numeMancare='" + numeMancare + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate + "grame"+
                '}';
    }

  //  @Override
   // public int compareTo(Meniu meniu) {
   //     return this.getNumeMancare().compareTo(meniu.getNumeMancare());
  //  }

}
