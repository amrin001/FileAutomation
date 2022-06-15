package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import automation.FolderName;
import automation.ScanFolder;

public class AutomationGUI extends JFrame implements ActionListener {

	Container container = getContentPane();
//	JButton manualButton = new JButton("Single File");
//	JButton autoButton = new JButton("Multiple File");
	JLabel absPath = new JLabel("Path Name");
	JLabel fileName = new JLabel("File Name");
	JTextField absPathField = new JTextField();
	JTextField fileNameField = new JTextField();
	JButton sortMan = new JButton ("Sort (Single)");
	JButton sortAuto = new JButton ("Sort (Multiple)");

	AutomationGUI() {
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
	}
	
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		absPath.setBounds(50, 150, 100, 30);
		fileName.setBounds(50, 220, 100, 30);
		absPathField.setBounds(150, 150, 350, 30);
		fileNameField.setBounds(150, 220, 350, 30);
		sortMan.setBounds(50, 300, 200, 30);
		sortAuto.setBounds(300, 300, 200, 30);
	}
	
	public void addComponentsToContainer() {
		container.add(absPath);
		container.add(fileName);
		container.add(absPathField);
		container.add(fileNameField);
		container.add(sortMan);
		container.add(sortAuto);
	}
	
	public void addActionEvent() {
		sortMan.addActionListener(this);
		sortAuto.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// for sorting single file
		if (e.getSource() == sortMan) {
			FolderName folderName = new FolderName();
			String path = absPathField.getText();
			String name = fileNameField.getText();
			String updatedFolder = folderName.folderLastModifiedDate(path, name);
			System.out.println(updatedFolder);
			File file = new File(updatedFolder);
			if (file.exists()) {
				folderName.moveFile(name, path, updatedFolder);
				System.out.println("File has been successfully moved!");
			} else {
				System.out.println("Folder does not exist! Creating folder now...");
				folderName.createFolder(updatedFolder);
				folderName.moveFile(name, path, updatedFolder);
				System.out.println("File has been successfully moved!");
			}
		}
		
		//for sorting multiple file
		if (e.getSource() == sortAuto) {
			String path = absPathField.getText();
			
			ScanFolder scanForFiles = new ScanFolder();

			for (int i = 0; i < scanForFiles.scanFolder(path).size(); i++) {
				String fileName = (String) scanForFiles.scanFolder(path).get(i);
				FolderName folderName = new FolderName();
				String updatedFolder = folderName.folderLastModifiedDate(path, fileName);
				File file = new File(updatedFolder);
				if (file.exists()) {
					folderName.moveFile(fileName, path, updatedFolder);
					System.out.println("File has been successfully moved!");
				} else {
					System.out.println("Folder does not exist! Creating folder now...");
					folderName.createFolder(updatedFolder);
					folderName.moveFile(fileName, path, updatedFolder);
					System.out.println("File has been successfully moved!");
				}
			}
		}
	}

}
