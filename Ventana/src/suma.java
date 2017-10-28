import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class suma {

	private JFrame frame;
	private JTextField txtOp1;
	private JTextField txtOp2;
	public JLabel lblRdo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					suma window = new suma();
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
	public suma() {
		initialize();
	}
	public void calcula(){
		double operador1,operador2,resultado;
		operador1=Double.parseDouble(txtOp1.getText());
		operador2=Double.parseDouble(txtOp2.getText());
		resultado=operador1+operador2;
		lblRdo.setText(Double.toString(resultado));
	}
	public void borra(){
		lblRdo.setText("");
		txtOp1.setText("");
		txtOp2.setText("");
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operador 1");
		lblNewLabel.setBounds(10, 11, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operador 2");
		lblNewLabel_1.setBounds(10, 36, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 61, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtOp1 = new JTextField();
		txtOp1.setBounds(99, 8, 86, 20);
		frame.getContentPane().add(txtOp1);
		txtOp1.setColumns(10);
		
		txtOp2 = new JTextField();
		txtOp2.setBounds(99, 33, 86, 20);
		frame.getContentPane().add(txtOp2);
		txtOp2.setColumns(10);
		
		lblRdo = new JLabel("");
		lblRdo.setBounds(99, 61, 86, 14);
		frame.getContentPane().add(lblRdo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				calcula();
			}
		});
		btnCalcular.setBounds(10, 98, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borra();
			}
		});
		btnBorrar.setBounds(109, 98, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
