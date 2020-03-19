package strings;

public class Main {
    static String membruClasa;

    public static void main(String[] args){

        System.out.println(membruClasa); // =NULL

        String s1 = "";
        String s2 = "abc";
        System.out.println(s2); //abc
        s2.toUpperCase();
        System.out.println(s2); //abc
      //  s2 = s2.toUpperCase();
        // System.out.println(s2); //ABC
        String s3 = new String("abc");
        String s4= "abc";

        System.out.println(s2 == s3);//false
        System.out.println(s3 == s4); //false
        System.out.println(s2 == s4);// true


    }

}
