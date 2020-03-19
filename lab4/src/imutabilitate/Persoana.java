package imutabilitate;

public final class Persoana {

    private final int id;
    private final String nume;
    private final Adresa adresa;

    public Persoana(int id, String nume) {
        this.id = id;
        this.nume = nume;
        String numeStrada = adresa.getStrada();
        String numarStrada = adresa.getNumar();
        Adresa copieAdresa = new Adresa(numeStrada,numarStrada);
        this.adresa = copieAdresa;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}
