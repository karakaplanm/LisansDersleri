import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Polygon;

class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        int xPoly[] = {390,422,529,448,478,393,305,335,248,358};
        int yPoly[] = {167,259,262,318,411,355,408,316,262,258};
        Polygon poly;

        poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2d.setColor(Color.red);
        g2d.drawPolygon(poly);


    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class PoligonCizim extends JFrame {

    public PoligonCizim() {
        initUI();
    }

    public final void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(800, 600);
        setTitle("Poligon");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PoligonCizim ornek = new PoligonCizim();
                ornek.setVisible(true);
            }
        });
    }
}
