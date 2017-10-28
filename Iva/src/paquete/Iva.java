package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Iva {

	private JFrame frame;
	private JTextField txtBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iva window = new Iva();
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
	public Iva() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCalculoDeIva = new JLabel("Calculo de IVA y total");
		lblCalculoDeIva.setBounds(133, 21, 135, 14);
		frame.getContentPane().add(lblCalculoDeIva);
		
		JLabel lblBaseImponible = new JLabel("Base Imponible");
		lblBaseImponible.setBounds(45, 51, 94, 14);
		frame.getContentPane().add(lblBaseImponible);
		
		JLabel iva = new JLabel("IVA");
		iva.setBounds(45, 76, 94, 14);
		frame.getContentPane().add(iva);
		
		JLabel total = new JLabel("Total");
		total.setBounds(45, 101, 94, 14);
		frame.getContentPane().add(total);
		
		JLabel lblIva = new JLabel("");
		lblIva.setBounds(156, 76, 94, 14);
		frame.getContentPane().add(lblIva);
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setBounds(156, 101, 94, 14);
		frame.getContentPane().add(lblTotal);
		
		txtBase = new JTextField();
		txtBase.setBounds(164, 46, 86, 20);
		frame.getContentPane().add(txtBase);
		txtBase.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtBase.getText().length()>0){
				double base=Double.parseDouble(txtBase.getText());
				double iva=base*(0.21);
				double total=base+iva;
				//pasamos los valores a la ventana
				lblIva.setText(String.valueOf(iva));
				lblTotal.setText(String.valueOf(total));}
				else{
					System.out.println("Introduce el valor de la Base Imponible");
				}
			}
		});
		btnCalcular.setBounds(45, 158, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtBase.setText("");
				lblIva.setText("");
				lblTotal.setText("");
			}
		});
		btnBorrar.setBounds(177, 158, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
