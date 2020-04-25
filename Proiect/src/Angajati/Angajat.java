package Angajati;

public abstract class Angajat {

    private String nume;
    private String prenume;
    private int bacsis;

    public Angajat(String nume, String prenume, int bacsis) {
        this.nume = nume;
        this.prenume = prenume;
        this.bacsis = bacsis;

    }

    public abstract int calculSal();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }



    public int getBacsis() {
        return bacsis;
    }

    public void setBacsis(int bacsis) {
        this.bacsis = bacsis;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()  + "{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", bacsis=" + bacsis +
                '}';
    }
}


