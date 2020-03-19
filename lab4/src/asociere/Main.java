package asociere;


public class Main {

    public static void main(String[] args) {

        Profesor profesorPrincipalMAte = new Profesor(1,"Popescu");
        Profesor profesorSecundarMAte = new Profesor(1, "Popescu");
        Profesor profesorInfo = new Profesor(1, "Popescu");
        Profesor profesorMAtesiInfo = new Profesor(1, "Popescu");
        Profesor profesorInfosiMAte = new Profesor(1, "Popescu");

        Departament departamentinfo= new Departament("info");
        departamentinfo.setProfesori(new Profesor[]{profesorInfo,profesorInfosiMAte,profesorMAtesiInfo});
        Departament departamentmate = new Departament("mate");
        departamentmate.setProfesori(new Profesor[]{profesorPrincipalMAte,profesorSecundarMAte,profesorInfosiMAte,profesorMAtesiInfo});

        Universitate unibuc= new Universitate("UNIBUC", new Departament[]{departamentinfo,departamentmate});
        System.out.println(unibuc);

    }
}


