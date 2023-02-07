package visão;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField cepf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomePessoa = new JLabel("Nome pessoa");
		lblNomePessoa.setBounds(135, 24, 54, 25);
		contentPane.add(lblNomePessoa);
		
		textField = new JTextField();
		textField.setBounds(199, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbCPF = new JLabel("CPF");
		lbCPF.setBounds(145, 60, 46, 14);
		contentPane.add(lbCPF);
		
		cepf = new JTextField();
		cepf.setBounds(199, 57, 86, 20);
		contentPane.add(cepf);
		cepf.setColumns(10);
	}
}
