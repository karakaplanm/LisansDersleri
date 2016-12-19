import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DosyadanOku {

        public static void main(String[] args) {

                File file = new File("dosya.txt");
                FileInputStream fis = null;

                try {
                        fis = new FileInputStream(file);

                        System.out.println("Okunan dosya uzunlugu (byte) : "
                                        + fis.available());

                        int icerik;
                        while ((icerik = fis.read()) != -1) {
                                System.out.print((char) icerik);
                        }

                } catch (IOException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (fis != null)
                                        fis.close();
                        } catch (IOException ex) {
                                ex.printStackTrace();
                        }
                }
        }
}
