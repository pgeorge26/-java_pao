package database;

import Angajati.Angajat;
import Angajati.Bucatar;
import Angajati.Manager;
import Angajati.Ospatar;
import Test.Meniu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class servicii {

    public void addAngajat(String post, String nume,String prenume,int salariu,int bacsis ) {
        String sql = "INSERT INTO angajati(post,nume,prenume,salariu,bacsis) VALUES(?,?,?,?,?)";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, post);
            pstmt.setString(2, nume);
            pstmt.setString(3, prenume);
            pstmt.setInt(4, salariu);
            pstmt.setInt(5, bacsis);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void concediazaAngajat(String nume ) {
        String sql = "DELETE FROM angajati WHERE nume = ?";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nume);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void addMeniu(String numeMancare, int pret,int cantitate ) {
        String sql = "INSERT INTO meniu(numeMancare,pret,cantitate) VALUES(?,?,?)";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, numeMancare);
            pstmt.setInt(2, pret);
            pstmt.setInt(3, cantitate);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void stergeMeniu(String numeMancare ) {
        String sql = "DELETE FROM meniu WHERE numeMancare = ?";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, numeMancare);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateMeniu(String numeMancare, int pret,int cantitate){

        String sql = "UPDATE meniu SET pret = ? , "
                + "cantitate = ? "
                + "WHERE numeMancare = ?";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(3, numeMancare);
            pstmt.setInt(1, pret);
            pstmt.setInt(2, cantitate);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void addMasa(int pozitieMasa, boolean debarasata) {
        String sql = "INSERT INTO mese(pozitie_masa,debarasata) VALUES(?,?)";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pozitieMasa);
            pstmt.setBoolean(2, debarasata);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void stergeMasa(int pozitieMasa ) {
        String sql = "DELETE FROM mese WHERE pozitie_masa = ?";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, pozitieMasa);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void debaraseazaMasa(int pozitieMasa, boolean debarasata)
    {

        String sql = "UPDATE mese SET debarasata = ? , "
                + " WHERE pozitie_masa = ? ";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {


            pstmt.setBoolean(1, debarasata);
            pstmt.setInt(2, pozitieMasa);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}


    public static List<Angajat> afiseazaAngajati() {
        String sql = "SELECT * FROM angajati";
        List<Angajat>angajati = new ArrayList<>();

        try (Connection conn = conexiune.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {



            while (rs.next()) {
                String post = rs.getString("post");
                String nume = rs.getString("nume");
                String prenume = rs.getString("prenume");
                int salariu = rs.getInt("salariu");
                int bacsis = rs.getInt("bacsis");


                if (post.equals("Ospatar"))
                {
                    angajati.add(new Ospatar(nume,prenume,bacsis,salariu));
                }else if(post.equals("Manager")) {
                    angajati.add(new Manager(nume,prenume,bacsis,salariu));
                }else if(post.equals("Bucatar")) {
                    angajati.add(new Bucatar(nume,prenume,bacsis,salariu));
                }
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return angajati;
    }

    public static int getPret(String nume) {
        String sql = "select pret FROM meniu WHERE numeMancare = '" + nume + "' ";

        int pret = 0;
        try (Connection conn = conexiune.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {


            while (rs.next()) {
                pret = rs.getInt("pret");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pret;

    }
    public static List<Meniu> meniuri() {
        String sql = "SELECT * FROM meniu";
        List<Meniu>meniuri = new ArrayList<>();

        try (Connection conn = conexiune.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {



            while (rs.next()) {
                String numeMancare = rs.getString("numeMancare");
                int pret = rs.getInt("pret");
                int cantitate = rs.getInt("cantitate");
                meniuri.add(new Meniu(numeMancare,pret,cantitate));

                }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return meniuri;
    }


    public void updateNota(String tip, int suma,boolean status,int id){

        String sql = "UPDATE nota SET suma = ? , "
                + " status = ? ,"
                + " tip = ? "
                + " WHERE id = ?";

        try (Connection conn = conexiune.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(3, tip);
            pstmt.setInt(1, suma);
            pstmt.setBoolean(2, status);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}
