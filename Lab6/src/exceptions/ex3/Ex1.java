package exceptions.ex3;

public class Ex1 {
    public static void main(String[] args){
        R1 r1 = null;
        try {
            r1 = new R1();
            //some logic
        }catch (Exception e){

        }finally {
            if(r1 != null ) {
                try {
                    r1.close();
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
