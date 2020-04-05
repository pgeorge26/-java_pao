import Angajati.Angajat;
import Angajati.Bucatar;
import Angajati.Manager;
import Angajati.Ospatar;
import Complex.Masa;
import Complex.Pub;
import Complex.Terasa;

import java.util.*;

public class Main  {

    public static void main(String[] args)
    {
        Ospatar ospatar1 = new Ospatar("Ion","Predoiu",200,1950);
        Ospatar ospatar2 = new Ospatar("Marian","Predoiu",200,2000);
        Ospatar ospatar3 = new Ospatar("George","Morel",200,1950);
        Bucatar bucatar1 = new Bucatar("Claudiu","Iosif",200,3000);
        Manager manager = new Manager("Razvan","Alex",0,5000);

        Meniu meniu1 = new Meniu("Friptura de pui",18,200);
        Meniu meniu2 = new Meniu("Friptura de porc",27,100);
        Meniu meniu3 = new Meniu("Ciorba",10,250);
        List<Meniu> meniu =  new ArrayList<Meniu>();
        Masa masa1= new Masa(1,true);
        Masa masa2= new Masa(2,false);
        Masa masa3= new Masa(3,false);
        List<Masa> mese =  new ArrayList<Masa>();
        Restaurant Amada = new Restaurant("Amada","Campulung",142342213,0,meniu,mese);
        Amada.adaugaMasa(masa1);
        Amada.adaugaMasa(masa2);
        Amada.adaugaMasa(masa3);
        Amada.adaugaMeniu(meniu1);
        Amada.adaugaMeniu(meniu2);
        Amada.adaugaMeniu(meniu3);

        Collections.sort(meniu, new Comparator<Meniu>(){
            public int compare(Meniu s1, Meniu s2) {
                return s1.getNumeMancare().compareToIgnoreCase(s2.getNumeMancare());
            }
        });


        Amada.adaugaAngajat(ospatar1);
        Amada.adaugaAngajat(ospatar2);
        Amada.adaugaAngajat(ospatar3);
        Amada.adaugaAngajat(bucatar1);
        Amada.adaugaAngajat(manager);

        Amada.verificMasa(masa3);
        System.out.println(Amada.toString());


        Nota nota1= new Nota("cash",0,false);
        Amada.comanda(masa1,meniu2,nota1);
        Amada.comanda(masa1,meniu1,nota1);
        Amada.platesteNota(masa1,nota1);



    }
}
