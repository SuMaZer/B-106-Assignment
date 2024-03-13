package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnum1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNum1Label = new JLabel("Enter Number One");
		lblNum1Label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum1Label.setBounds(40, 60, 156, 21);
		contentPane.add(lblNum1Label);

		textnum1 = new JTextField();
		textnum1.setBounds(206, 63, 197, 21);
		contentPane.add(textnum1);
		textnum1.setColumns(10);

		JTextField textnum2 = new JTextField();
		textnum2.setColumns(10);
		textnum2.setBounds(206, 114, 197, 21);
		contentPane.add(textnum2);

		JLabel lblNum2Label = new JLabel("Enter Number Two");
		lblNum2Label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum2Label.setBounds(40, 112, 156, 21);
		contentPane.add(lblNum2Label);

		JButton btnsumButton = new JButton("+");
		btnsumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = (Double.parseDouble(textnum1.getText()) + Double.parseDouble(textnum2.getText()));
				JOptionPane.showMessageDialog(btnsumButton, "Answer :: " + result);
			}
		});
		btnsumButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnsumButton.setBounds(69, 192, 44, 39);
		contentPane.add(btnsumButton);

		JButton btnSubButton = new JButton("-");
		btnSubButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = (Double.parseDouble(textnum1.getText()) - Double.parseDouble(textnum2.getText()));
				JOptionPane.showMessageDialog(btnSubButton, "Answer :: " + result);
			}
		});
		btnSubButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubButton.setBounds(152, 192, 44, 39);
		contentPane.add(btnSubButton);

		JButton btnmulButton = new JButton("x");
		btnmulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double result = (Double.parseDouble(textnum1.getText()) * Double.parseDouble(textnum2.getText()));
				JOptionPane.showMessageDialog(btnmulButton, "Answer :: " + result);
			}
		});
		btnmulButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnmulButton.setBounds(242, 192, 44, 39);
		contentPane.add(btnmulButton);

		JButton btndivButton = new JButton("/");
		btndivButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = (Double.parseDouble(textnum1.getText()) / Double.parseDouble(textnum2.getText()));
				JOptionPane.showMessageDialog(btndivButton, "Answer :: " + result);
			}
		});
		btndivButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btndivButton.setBounds(341, 192, 44, 39);
		contentPane.add(btndivButton);

		JButton btnmolButton = new JButton("%");
		btnmolButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = (Double.parseDouble(textnum1.getText()) % Double.parseDouble(textnum2.getText()));
				JOptionPane.showMessageDialog(btnmolButton, "Answer :: " + result);
			}
		});
		btnmolButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnmolButton.setBounds(441, 192, 44, 39);
		contentPane.add(btnmolButton);
	}
}
