package imutabilitate;

public class Main {
    public static void main(String[] args) {

        Adresa domiciliu = new Adresa("Timisoara","4A");
       Persoana persoana = new Persoana(1,"teo");
      String numepersoana= persoana.getNume().toUpperCase();
      System.out.println(persoana);
      System.out.println(numepersoana);

      String stradaUppercase=domiciliu.getStrada().toUpperCase();
      domiciliu.setStrada(stradaUppercase);
      System.out.println(persoana);

      Adresa adresadomiciliu = persoana.getAdresa();
      String strada = adresadomiciliu.getStrada();
      adresadomiciliu.getStrada(strada.toUpperCase());

      System.out.println(persoana);

    }

}
