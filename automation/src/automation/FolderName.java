package automation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FolderName { // creating folder name
	
	public String getCurrentDate() {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM. MMM yy");
		String dateOnly = dateFormat.format(currentDate);
		return dateOnly;
	}
	
	public String dirName(String path) {
		String newDirectory = path.concat(getCurrentDate()+"/");
		return newDirectory;
	}

	public String folderLastModifiedDate(String path, String fileName, GetFileData lastModified) {
		String newDirectory = path.concat(lastModified.getLastModified(path, fileName)+"/");
		return newDirectory;
	}
	
	public void createFolder(String folder) {
		File path = new File(folder);
		if (path.exists())
			System.out.println("This folder already exists!");
		else {
			new File(folder).mkdir();
			System.out.println("A new folder have been created!");
		}
	}
	
	public void moveFile(String fileName, String path, String newPath) {
		File file = new File(path + fileName);
		file.renameTo(new File(newPath + fileName));

	}


}
