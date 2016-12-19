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
import java.awt.Font;

class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {
    	
        Graphics2D cizim1 = (Graphics2D) g;
        Font font = new Font("Serif", Font.PLAIN, 36);
        cizim1.setFont(font);
        cizim1.setColor(Color.blue);
        cizim1.drawString("Yıldızlar geçidi", 100, 200);
        for (int kenar=3;kenar<10;kenar++){
        int [] xPoly=new int[kenar*2];
        int [] yPoly=new int[kenar*2];
        
        for (int kose=0;kose<kenar*2-1;kose=kose+2)
        {
        	xPoly[kose]=(int) (Math.cos(kose*Math.PI*2/(2*kenar))*50)+(kenar-2)*100;
        	yPoly[kose]=(int) (Math.sin(kose*Math.PI*2/(2*kenar))*50)+300;
        	xPoly[kose+1]=(int) (Math.cos((kose+1)*Math.PI*2/(2*kenar))*20)+(kenar-2)*100;
        	yPoly[kose+1]=(int) (Math.sin((kose+1)*Math.PI*2/(2*kenar))*20)+300;
        }
        Polygon poly;
        poly = new Polygon(xPoly, yPoly, kenar*2);
        cizim1.setColor(Color.red);
        cizim1.fillPolygon(poly);
        cizim1.drawString(""+kenar, (kenar-2)*100, 400);
        
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class CokKenar extends JFrame {

    public CokKenar() {
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
                CokKenar ornek = new CokKenar();
                ornek.setVisible(true);
            }
        });
    }
}
