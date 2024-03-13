package gui;

import javax.swing.JOptionPane;

public class JOPtionPanesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		JOptionPane.showMessageDialog(null, "Welcome IMU!!!");
//		int choice = JOptionPane.showConfirmDialog(null, "Erased your Disk (aka) Storage ???");
//		if(choice==JOptionPane.YES_OPTION) 
//		{
//			JOptionPane.showMessageDialog(null, "Disk erased!");
//		}
//		else if(choice == JOptionPane.NO_OPTION) 
//		{
//			JOptionPane.showMessageDialog(null, "Disc not erased!");
//		}
//		else 
//		{
//			JOptionPane.showMessageDialog(null, "Cancelled");
//		}
//	}
		String name = JOptionPane.showInputDialog(null,"What is Your Name ?");
		JOptionPane.showMessageDialog(null, "Your Name is "+name);
		
	}
}
