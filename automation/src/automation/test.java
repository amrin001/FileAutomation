package automation;

import java.io.File;

public class test {

	public static void main(String[] args) {
		String path = "/Users/amrinbinanan/Movies/Timelapse/Charizard/";
		FolderName folderName = new FolderName();
		
		String newFolder = folderName.dirName(path);
		System.out.println(newFolder);
//		folderName.createFolder(newFolder);
		
		GetFileData getData = new GetFileData();
		String fileName = "Charizard timelapse.mp4";
		String lastModDate = getData.getLastModified(path, fileName);
		System.out.println("The last modified date for this file is "+lastModDate);
		
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
