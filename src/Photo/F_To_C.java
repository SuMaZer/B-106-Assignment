package Photo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F_To_C extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCelsiusField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_To_C frame = new F_To_C();
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
	public F_To_C() {
		setTitle("Celsius to Fahrenheit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCelsiusField = new JTextField();
		textCelsiusField.setBounds(35, 40, 96, 19);
		contentPane.add(textCelsiusField);
		textCelsiusField.setColumns(10);
		
		JButton btnFahrButton = new JButton("Convert");
		btnFahrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double F = (Double.parseDouble(textCelsiusField.getText())*9/5)+32;
				JOptionPane.showMessageDialog(btnFahrButton, "Fahrenheit "+F);
			}
		});
		btnFahrButton.setBounds(34, 69, 85, 21);
		contentPane.add(btnFahrButton);
		
		JLabel lblCLabel = new JLabel("Celsius");
		lblCLabel.setBounds(153, 43, 45, 13);
		contentPane.add(lblCLabel);
		
		JLabel lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setBounds(153, 73, 69, 13);
		contentPane.add(lblNewLabel);
	}

}
