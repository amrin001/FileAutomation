package automation;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManualScript {

	public static void main(String[] args) {
		String path = "\\\\SVRSG001RPS01.asia.corp.anz.com\\binanana$\\My Documents/";
		ArrayList<String> fileNames = new ArrayList<>();

		System.out.println("Please enter the name of the file(s)...");
		Scanner scanner2 = new Scanner(System.in);
		String fileName = scanner2.nextLine();

		// GetFileData getData = new GetFileData();
		// String lastModDate = getData.getLastModified(path, fileName);
		// System.out.println("The last modified date for this file is " + lastModDate);

		FolderName folderName = new FolderName();

		String updatedFolder = folderName.folderLastModifiedDate(path, fileName);
		System.out.println(updatedFolder);
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
