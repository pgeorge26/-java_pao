public class Nota {

    private String tip;
    protected int suma;
    private boolean status;

    public Nota(String tip, int suma, boolean status) {
        this.tip = tip;
        this.suma = suma;
        this.status = status;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
