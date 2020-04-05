package Angajati;

public class Bucatar extends Angajat {

    private int salariu;

    public Bucatar(String nume, String prenume, int bacsis, int salariu) {
        super(nume, prenume, bacsis);
        this.salariu = salariu;
    }

    public int getSalariu_Bucatar() {
        return salariu;
    }

    public void setSalariu_Bucatar(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public int calculSal() {
        int sal = salariu + (getBacsis() * 1/3);
        setSalariu_Bucatar(sal);
        return sal;
    }

    @Override
    public String toString() {
        return super.toString()+ " salariu Bucatar =" + calculSal() + " lei}";
    }
}
