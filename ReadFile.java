import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        try {
            // FileInputStream fis = new FileInputStream("abc.txt");
            // FileInputStream fis = new FileInputStream("C:/Users/Aman_Tiwari/Desktop/program.txt");
            FileInputStream fis = new FileInputStream("C://Users//Aman_Tiwari//Desktop//program.txt");
            System.out.println("available bytes :" + fis.available());

            // System.out.println((char) fis.read());
            // while (fis.available() > 0) {
            //     System.out.print((char) fis.read());
            // }
            // fis.close();
            // byte b[]=new byte[5];
            // fis.read(b);
            // System.out.println(new String(b));

            byte b[] =fis.readAllBytes();
            String data=new String(b);
            System.out.println(data);


        } catch (FileNotFoundException f) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("IO Exception");
        }
    }
}