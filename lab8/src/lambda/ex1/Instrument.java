package lambda.ex1;


public interface Instrument {

    // exactly one abstract method
    void play();

    default void clean(){
        System.out.println("in default method");
    }

    static void inStatic(){
        System.out.println("in static method");
    }

}
