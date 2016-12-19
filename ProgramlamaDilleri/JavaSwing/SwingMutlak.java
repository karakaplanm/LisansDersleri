import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class SwingMutlak extends JFrame {


    public SwingMutlak() {

        initUI();
    }

    public final void initUI() {

        setLayout(null);

        JButton tamam = new JButton("Tamam");
        tamam.setBounds(50, 50, 100, 25);

        JButton kapa = new JButton("Kapat");
        kapa.setBounds(150, 90, 80, 35);
        add(tamam);
        add(kapa);
        setTitle("Mutlak Yerlestirme");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                SwingMutlak ornek = new SwingMutlak();
                ornek.setVisible(true);
            }
        });
    }
}

