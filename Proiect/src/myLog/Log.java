package myLog;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Log {
    private static Log log = new Log("logs.csv");
    private FileWriter csvWriter;
    private Log() {}
    private Log(String FileName) {
        try {
            csvWriter = new FileWriter(FileName, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void logData (String data) {
        try {
            log.csvWriter.append(data + "," + (new Timestamp(System.currentTimeMillis())).toString());
            log.csvWriter.append("\n");
            log.csvWriter.flush();

        } catch (IOException e) {
            System.out.println("Error while logging: " + data);
            e.printStackTrace();
        }
    }
}