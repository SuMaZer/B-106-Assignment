package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTextField_Example extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextField_Example frame = new JTextField_Example();
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
	public JTextField_Example() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JTextField_Example.class.getResource("/gui/bb/yor_forger_loid_forger_dancing_4k_5k_hd_spy_x_family.jpg")));
		setBackground(new Color(255, 255, 255));
		setTitle("JText Field");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 244);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Who are You?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(56, 45, 115, 25);
		contentPane.add(lblNewLabel);
		
		TextName = new JTextField();
		TextName.setForeground(new Color(0, 0, 0));
		TextName.setBounds(56, 67, 126, 19);
		contentPane.add(TextName);
		TextName.setColumns(10);
		
		JButton btnNameButton = new JButton("Show");
		btnNameButton.setForeground(new Color(255, 255, 0));
		btnNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNameButton, "My Name is "+TextName.getText());
			}
		});
		btnNameButton.setBackground(new Color(128, 0, 64));
		btnNameButton.setBounds(192, 66, 85, 21);
		contentPane.add(btnNameButton);
	}
}
