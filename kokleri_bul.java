package java_odev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kokleri_bul {

	private JFrame frame;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kokleri_bul window = new kokleri_bul();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kokleri_bul() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnKokleriBul = new JButton("Kokleri Bul");
		btnKokleriBul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(txta.getText());
				int b=Integer.parseInt(txtb.getText());
				int c=Integer.parseInt(txtc.getText());
				
				double delta = b*b-4*a*c;
				double x1,x2;
				
				String sonuc;
				if(delta>0){
					x1=((-b-Math.sqrt(delta))/2*a);
					x2=((-b-Math.sqrt(delta))/2*a);
					
					
					sonuc="Kokler  : x1=   "+x1+"   ,   x2=   "+x2;										
				}
				else if(delta == 0){
					x1=-b/2*a;
					sonuc="Kokler  :   x1= "+x1;
					
				}
		        else {
					sonuc="Reel kok yoktur . ";
				}
				text.setText(sonuc);
				
			}
		});
		btnKokleriBul.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		btnKokleriBul.setBounds(80, 202, 155, 33);
		frame.getContentPane().add(btnKokleriBul);
		
		JLabel lblIkinciDerecedenBir = new JLabel("Ikinci dereceden bir denklemin koklerinin bulunmasi");
		lblIkinciDerecedenBir.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblIkinciDerecedenBir.setBounds(11, 16, 620, 33);
		frame.getContentPane().add(lblIkinciDerecedenBir);
		
		txta = new JTextField();
		txta.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txta.setBounds(37, 96, 69, 56);
		frame.getContentPane().add(txta);
		txta.setColumns(10);
		
		
		txtb = new JTextField();
		txtb.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtb.setColumns(10);
		txtb.setBounds(210, 96, 69, 56);
		frame.getContentPane().add(txtb);
		
		
		txtc = new JTextField();
		txtc.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtc.setColumns(10);
		txtc.setBounds(355, 96, 69, 56);
		frame.getContentPane().add(txtc);
		
		text = new JTextField();
		text.setFont(new Font("Tahoma", Font.PLAIN, 23));
		text.setColumns(10);
		text.setBounds(11, 274, 607, 56);
		frame.getContentPane().add(text);
		text.setEditable(false);
		
		
		JLabel lbl1 = new JLabel("X^2+");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lbl1.setBounds(122, 97, 69, 56);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("X +");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lbl2.setBounds(294, 96, 69, 56);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("= 0");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lbl3.setBounds(450, 97, 69, 56);
		frame.getContentPane().add(lbl3);
	}
}
