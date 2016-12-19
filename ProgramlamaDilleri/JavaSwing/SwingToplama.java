import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingToplama extends JFrame
{
	JLabel label1; JLabel label2;
	public static void main(String[] args)
	{	new SwingToplama(); }

	public SwingToplama()
	{
		JPanel panel1=new JPanel();
		JTextField giris1= new JTextField(4);
		JTextField giris2= new JTextField(4);
		JTextField cikti= new JTextField(4);
		label1=new JLabel("+");	label2=new JLabel("=");
		JButton button1=new JButton("Tamam");
		button1.addActionListener(new
			ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Integer sayi1= Integer.valueOf(giris1.getText());	
				Integer sayi2= Integer.valueOf(giris2.getText());
				Integer sonuc= sayi1+sayi2;
				cikti.setText(sonuc.toString());

			}
		});
		panel1.add(giris1);panel1.add(label1);panel1.add(giris2);
		panel1.add(label2);	panel1.add(cikti);panel1.add(button1);
		this.add(panel1);this.setTitle("Toplama");this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
