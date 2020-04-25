package fisier;
import org.jetbrains.annotations.NotNull;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class csv {


    private csv() {}


    public static List<String[]> citesteCSV(String path) {
        String aux = "";
        String splitBy = ",";
        List<String[]> csv = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((aux = br.readLine()) != null) {
                String[] line = aux.split(splitBy);
                csv.add(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return csv;
    }

    public static void scrieCsv(String path, @NotNull String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length - 1; i++) {
            sb.append(args[i]).append(",");
        }
        sb.append(args[args.length - 1]);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.write(sb.toString());
            writer.newLine();
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}