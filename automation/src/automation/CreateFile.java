package automation;

import java.io.File;

public class CreateFile {
	
	public static void main(String[] args) {
		FolderName folderName = new FolderName();
		boolean createFolder = new File(folderName.dirName()).mkdir();
		if (createFolder) {
			System.out.println("This folder does not exist.");
			new File(folderName.dirName()).mkdir();
			}
		else
			System.out.println("This folder exists!");
//		File file = new File(folderName.dirName()+"/newFile.txt");
		String path = "\\\\\\\\SVRSG001RPS01.asia.corp.anz.com\\\\binanana$\\\\Desktop/";
		File file = new File(path+"/newFile2.txt");
		
		
		try {
			boolean value = file.createNewFile();
			if (value) {
				System.out.println("The new file is created!");
			} else {
				System.out.println("The file already exists!");
			}
		} catch(Exception e) {
			e.getStackTrace();
		}

	}

}
