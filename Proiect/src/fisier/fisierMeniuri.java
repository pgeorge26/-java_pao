package fisier;
import Test.Meniu;

import java.util.ArrayList;
import java.util.List;

import static fisier.csv.citesteCSV;
import static java.lang.Integer.parseInt;


public class fisierMeniuri {
    private static final fisierMeniuri INSTANCE;
    private static List<Meniu> meniuri;

    static {
        INSTANCE = new fisierMeniuri();
        meniuri = new ArrayList<>();
    }

    public static fisierMeniuri getInstance() {
        return INSTANCE;
    }

    private fisierMeniuri() {}

    public void addMeniu(Meniu meniu) {

        try {
            meniuri.add(meniu);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    public void adaugaMeniuFisier(String path) {
        List<String[]> csv = citesteCSV(path);
        for (String[] m : csv) {
            if (m.length != 3) {
                continue;
            }
            this.addMeniu(new Meniu(m[0], parseInt(m[1]), parseInt(m[2])));
        }
    }

    public void stergeMeniu(Meniu Meniu) {
        try {
            if (!meniuri.remove(Meniu)) {
                System.out.println("Meniul nu exista");
            }
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Meniu a: meniuri) {
            s.append(a.toString()).append("\n");
        }
        return s.toString();
    }

    }