package Angajati;

import myLog.Log;

public class Ospatar extends Angajat {

   private int salariu;

    public Ospatar(String nume, String prenume, int bacsis, int salariu) {
        super(nume, prenume, bacsis);
        this.salariu = salariu;
        Log.logData("Avem un nou   " + this);
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu_Ospatar(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public int calculSal() {
        int sal = salariu + (getBacsis() * 2/3);
        setSalariu_Ospatar(sal);
        return sal;
    }

    @Override
    public String toString() {
        return super.toString()+" salariu Ospatar =" + calculSal() + "lei }";
    }
}
