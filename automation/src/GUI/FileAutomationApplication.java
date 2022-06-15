package GUI;

import javax.swing.JFrame;

public class FileAutomationApplication {
	
	public static void main(String[] args) {
		AutomationGUI frame = new AutomationGUI();
		frame.setTitle("File Sorting System");
		frame.setVisible(true);
		frame.setBounds(10, 10, 570, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
	}


}
