import Angajati.Angajat;
import Complex.Masa;
import Test.Meniu;
import myLog.Log;


import java.util.*;

public class Restaurant  {
    private String numeRestaurant;
    private String Adresa;
    private int IBAN;
    private  int numar_angajati=0;

    private Angajat[] Angajati= new Angajat[8];
    private List<Meniu> meniu;
    private List<Masa> mese;

    public Restaurant(String numeRestaurant, String adresa, int IBAN, int numar_angajati, List<Meniu> meniu, List<Masa> mese) {
        this.numeRestaurant = numeRestaurant;
        Adresa = adresa;
        this.IBAN = IBAN;
        this.numar_angajati = numar_angajati;
        this.meniu = meniu;
        this.mese = mese;
        Log.logData("Avem un nou Restaurant  " + this);
    }

    public void adaugaMasa(Masa masa)
    {
        mese.add(masa);
    }
    public void adaugaMeniu(Meniu mancare)
    {
        meniu.add(mancare);
    }

    public void adaugaAngajat(Angajat angajat)
    {
            Angajati[numar_angajati] = angajat;
            System.out.println("Adaugat " + angajat.getClass().getSimpleName() + " ,iar acum avem un efectiv de " + numar_angajati++ + " angajati");
        }

     public void verificMasa(Masa masa)
     {
         if(masa.isDebarasata() == false)
             masa.setDebarasata(true);
     }

     public void comanda(Masa masa,Meniu meniu,Nota nota1)
     {
         System.out.println( masa + "vrea sa comande " + meniu.getNumeMancare());
         nota1.suma=nota1.suma+meniu.getPret();
         System.out.println("Total de plata pana acum "+ nota1.suma + " lei");

     }
     public void platesteNota(Masa masa ,Nota nota)
     {
         System.out.println("Masa " + masa.getPozitie_masa() + " are de platit "+nota.getSuma() + " lei " + nota.getTip());
         if(nota.isStatus()==false) {
             nota.setStatus(true);
             System.out.println("Suma achitata");
             Log.logData("Nota de la masa " + masa.getPozitie_masa() + " a fost platita");
         }


     }

    @Override
    public String toString() {
        return "Restaurant{" +
                "numeRestaurant='" + numeRestaurant + '\'' +
                ", Adresa='" + Adresa + '\'' +
                ", IBAN=" + IBAN +
                ", numar_angajati=" + numar_angajati +
                ", Angajati=" + Arrays.toString(Angajati) +
                ", meniu=" +meniu+
                ", mese=" +mese +
                '}';
    }

}
