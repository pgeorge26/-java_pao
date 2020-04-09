package streams;
import  java.io.File;
import java.io.IOException;

public class Ex1 {

    private static final String BASE_ATH = "./Lab6/src/streams";

    public static void main(String[] args) {
        //get file separator
        System.out.println(System.getProperty("file.separator"));
        System.out.println(File.separator);


        //create director
        File dir1 = new File(BASE_ATH, "dir1");
        System.out.println(dir1.mkdir());

        File dir2 = new File(BASE_ATH, "/a/b/c/dir2");
        System.out.println(dir2.mkdirs());


        //create new File

        File file1 = new File(BASE_ATH, "file1.txt");
        try {
            if (file1.createNewFile()) {
                System.out.println("file created");
            }
            else {
                System.out.println(file1.exists());
                System.out.println(file1 + "already exists");

            }
        } catch (IOException e) {
                System.out.println(e);
            }
            
        }
    }
