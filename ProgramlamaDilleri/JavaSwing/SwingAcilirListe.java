import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class SwingAcilirListe extends JFrame
{
	JLabel label1; JLabel label2;
	public static void main(String[] args)
	{	new SwingAcilirListe(); }

	public SwingAcilirListe()
	{
		JPanel panel1=new JPanel();
		JTextField cikti= new JTextField(4);
		String[] meyveList = { "Meyve Seç", "Elma", "Armut", "Ayva" };
		JComboBox meyveler = new JComboBox(meyveList);
		meyveler.setSelectedIndex(0);
		JButton button1=new JButton("Temizle");
		
	    JCheckBox secim = new JCheckBox("Sıra");
	    secim.setMnemonic(KeyEvent.VK_C); 
	    secim.setSelected(true);
		
		button1.addActionListener(new
			ActionListener() {
				public void actionPerformed(ActionEvent e) {
				cikti.setText("");
			}
		});
		
		cikti.addActionListener(new
				ActionListener() {
					public void actionPerformed(ActionEvent e) {
					System.out.println("Entere Basıldı");
				}
					
			});
		

		cikti.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				e.getKeyChar();
				System.out.println(e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			
		});
				
				
				
		meyveler.addActionListener(new
				ActionListener() {
					public void actionPerformed(ActionEvent e) {	
					int sira=meyveler.getSelectedIndex();
					if (secim.isSelected()) {
						cikti.setText(String.valueOf(meyveler.getSelectedIndex()));
					}
					else cikti.setText((String) meyveler.getSelectedItem());
				}
			});
		
		panel1.add(meyveler);
		panel1.add(secim);
		panel1.add(cikti);
		panel1.add(button1);
		this.add(panel1);this.setTitle("Toplama");this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
