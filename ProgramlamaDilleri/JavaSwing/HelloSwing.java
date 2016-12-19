import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloSwing extends JFrame
{
   JLabel label1,label2;
   
   public static void main(String[] args)
   {
      new HelloSwing();
   }
   public HelloSwing()
   {
	  
	   
        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        label1=new JLabel("Hello");
        label1.setBounds(50, 10, 100, 25);
        label2=new JLabel("Deneme");
        label2.setBounds(200, 10, 100, 25);
   
        JTextField giris = new JTextField(15);
        giris.setBounds(50, 100, 100, 25);
        
        JButton button1=new JButton("Tamam");
        button1.setBounds(50, 50, 100, 25);
        
        JButton button2=new JButton("Başla");
        button2.setBounds(200, 50, 100, 25);
        
        button1.addActionListener(new
        ActionListener() {
           public void actionPerformed(
           ActionEvent e) {  label1.setText("Oldu");
           giris.setText("315");
           }
        });
        
        button2.addActionListener(new
        ActionListener() {
           public void actionPerformed(
           ActionEvent e) {  label2.setText("Tamamdır");
           giris.setText("0");
           }
        });
        
    panel1.add(label1);
    panel1.add(button1); 
    
    panel1.add(label2);
    panel1.add(button2);
    panel1.add(giris);
    this.add(panel1);
    this.setTitle("Hello World");this.setSize(500,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
