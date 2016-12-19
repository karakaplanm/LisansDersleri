import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DosyayaYaz {

        public static void main(String [] args)
        {
        try {

                String icerik = "Bu satirlar dosyaya yazilacak.";
                File file = new File("dosya.txt");
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(icerik);
                bw.close();
                System.out.println("Yazıldı");

                } catch (IOException e) {
                        e.printStackTrace();
                }

        }
}
