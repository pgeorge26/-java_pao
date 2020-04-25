package fisier;
import Angajati.Angajat;
import Angajati.Bucatar;
import Angajati.Manager;
import Angajati.Ospatar;

import java.util.ArrayList;
import java.util.List;

import static fisier.csv.citesteCSV;
import static java.lang.Integer.parseInt;

public class fisierAngajati {
    private static final fisierAngajati INSTANCE;
    private static List<Angajat> angajati;

    static {
        INSTANCE = new fisierAngajati();
        angajati = new ArrayList<>();
    }


    private fisierAngajati() {
    }

    public static fisierAngajati getInstance() {
        return INSTANCE;
    }

    public void addAngajat(Angajat angajat) {

        try {
            angajati.add(angajat);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void adaugaAngajatiFisier(String path, boolean bucatar, boolean manager, boolean ospatar) {
        List<String[]> csv = citesteCSV(path);
        for (String[] a : csv) {
            if (a.length != 4) {
                continue;
            }
            if (bucatar) {
                this.addAngajat(new Bucatar(a[0], a[1], parseInt(a[2]), parseInt(a[3])));
            } else if (manager) {
                this.addAngajat(new Manager(a[0], a[1],parseInt(a[2]), parseInt(a[3])));
            } else if (ospatar) {
                this.addAngajat(new Ospatar(a[0], a[1],parseInt(a[2]), parseInt(a[3])));

            }
        }


    }
    public void stergeAngajat(Angajat angajat) {
        try {
            if (!angajati.remove(angajat)) {
                System.out.println("Angajatul nu exista");
            }
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }



    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Angajat a: angajati) {
            s.append(a.toString()).append("\n");
        }
        return s.toString();
    }
}
