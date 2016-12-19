import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingToplama extends JFrame
{
   JLabel label1,label2;
   
   public static void main(String[] args)
   {
      new SwingToplama();
   }
   public SwingToplama()
   {   
       JPanel panel1=new JPanel();
        panel1.setLayout(null);
        JTextField giris1 = new JTextField(15);
        giris1.setBounds(50, 100, 50, 25);
        JTextField giris2 = new JTextField(15);
        giris2.setBounds(150, 100, 50, 25);        
        JTextField sonuc = new JTextField(15);
        sonuc.setBounds(250, 100, 50, 25);
        JButton button1=new JButton("Topla");
        button1.setBounds(350, 100, 100, 25);
        
        button1.addActionListener(new
        ActionListener() {
           public void actionPerformed(
           ActionEvent e) {
        	   if (giris1.getText().length()>0 && giris2.getText().length()>0) {
        	   int sayi1= Integer.valueOf(giris1.getText());
        	   int sayi2= Integer.valueOf(giris2.getText());
        	   int toplam=sayi1+sayi2;
        	   sonuc.setText(String.valueOf(toplam));
        	   }
        	   else sonuc.setText("Null");
           }
        });
    panel1.add(giris1);
    panel1.add(giris2);
    panel1.add(sonuc);
    
    panel1.add(button1); 
    
    this.add(panel1);
    this.setTitle("Toplama Örneği");this.setSize(500,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
