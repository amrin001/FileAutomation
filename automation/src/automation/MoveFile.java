package automation;

import java.io.File;

public class MoveFile {
	
	public boolean checkFolderExist(String path) {
		File checkPath = new File(path);
		if (checkPath.exists()) {
			System.out.println("This path is valid.");;
		} else {
			System.out.println("This path is invalid.");
		}
		return false;
	}

	public void moveFile(String fileName) {
		FolderName folderName = new FolderName();
		String path = "\\\\\\\\SVRSG001RPS01.asia.corp.anz.com\\\\binanana$\\\\Desktop/";
//		String fileName = "newFile2.txt";
		File file = new File(path+fileName);
		if (file.exists()) {
			file.renameTo(new File (folderName.dirName()+fileName));
//			Files.move(path+fileName, folderName.dirName()+fileName, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File has been moved.");
		} else {
			System.out.println("There is no file with that name.");
		}

	}

}
