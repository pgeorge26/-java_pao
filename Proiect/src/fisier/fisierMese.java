package fisier;

import Complex.Masa;

import java.util.ArrayList;
import java.util.List;

import static fisier.csv.citesteCSV;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

public class fisierMese {


    private static final fisierMese INSTANCE;
    private static List<Masa> mese;

    static {
        INSTANCE = new fisierMese();
        mese = new ArrayList<>();
    }

    public static fisierMese getInstance() {
        return INSTANCE;
    }

    private fisierMese() {
    }

    public void addMasa(Masa masa) {

        try {
            mese.add(masa);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void adaugaMeseFisier(String path) {
        List<String[]> csv = citesteCSV(path);
        for (String[] m : csv) {
            if (m.length != 2) {
                continue;
            }
            this.addMasa(new Masa(parseInt(m[0]), parseBoolean(m[1])));
        }
    }

    public void stergeMasa(Masa masa) {
        try {
            if (!mese.remove(masa)) {
                System.out.println("Masa nu exista");
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Masa a: mese) {
            s.append(a.toString()).append("\n");
        }
        return s.toString();
    }

}