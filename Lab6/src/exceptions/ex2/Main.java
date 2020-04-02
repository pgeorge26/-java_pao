package exceptions.ex2;

public class Main {
    private static final int AMOUNT = 100;
    public static void main(String[] args) {

       try {
           m1(101);
       }catch (MyCheckException e) {
           System.out.println(e);
           m2();
       }finally {
           System.out.println("finally");
       }

    }
    static int m1(int x) throws  MyCheckException{
        if (x < AMOUNT) {
            return x * 5;
        }else {
            throw new MyCheckException(":(");
        }
    }

    static  void m2(){
        throw new MyRuntimeException("my rt exception in m2");
    }
}
