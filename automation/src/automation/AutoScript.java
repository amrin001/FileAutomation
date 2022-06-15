package automation;

import java.io.File;
import java.util.Scanner;

public class AutoScript {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a directory name: ");
		String path = scanner.nextLine();
		
		ScanFolder scanForFiles = new ScanFolder();
		
		for (int i=0; i < scanForFiles.scanFolder(path).size(); i++) {
			String fileName = (String) scanForFiles.scanFolder(path).get(i);
			GetFileData getData = new GetFileData();
			FolderName folderName = new FolderName();
			String updatedFolder = folderName.folderLastModifiedDate(path, fileName, getData);
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
