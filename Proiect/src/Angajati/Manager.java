package Angajati;

import myLog.Log;

public class Manager extends Angajat {

    private int salariu;

    public Manager(String nume, String prenume, int bacsis, int salariu) {
        super(nume, prenume, bacsis);
        this.salariu = salariu;
        Log.logData("Avem un nou   " + this);
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public int calculSal() {
        int sal = salariu + 200;
        setSalariu(sal);
        return sal;
    }

    @Override
    public String toString() {
        return super.toString()+" salariu Manager =" + calculSal() + " lei }";
    }
}
