package polymorphism.zoo.carnivor;

public class Pisica extends Carnivor {

    public Pisica(String nume, int varsta){
        super(nume,varsta);
        this.sunetSpecific="miauna";
    }
    @Override
    public void scoateSunet() {
        System.out.println("pisica " + this.sunetSpecific);
    }

    @Override
    public String toString() {
        return super.toString() + " Pisica{" +
                "sunetSpecific='" + sunetSpecific + '\'' +
                '}';
    }
}
