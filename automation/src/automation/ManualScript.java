package automation;

import java.io.File;
import java.util.Scanner;

public class ManualScript {

	public static void main(String[] args) {
		System.out.println("Enter the name of the path...");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
//		String path = "\\\\SVRSG001RPS01.asia.corp.anz.com\\binanana$/Downloads/";
		System.out.println("Please enter the name of the file...");
		Scanner scanner2 = new Scanner(System.in);
		String fileName = scanner2.nextLine();
//		String fileName = "FireWall_Req_UCD (1).xlsx";
		FolderName folderName = new FolderName();
		
		GetFileData getData = new GetFileData();
		String lastModDate = getData.getLastModified(path, fileName);
		System.out.println("The last modified date for this file is "+lastModDate);
		
		String updatedFolder = folderName.folderLastModifiedDate(path, fileName, getData);
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
