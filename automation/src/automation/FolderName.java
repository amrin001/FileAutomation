package automation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FolderName { // creating folder name
	
	public String getCurrentDate() {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM. MMM yy");
		String dateOnly = dateFormat.format(currentDate);
		return dateOnly;
	}
	
	public String dirName() {
		String path = "\\\\\\\\SVRSG001RPS01.asia.corp.anz.com\\\\binanana$\\\\Desktop/";
		String newDirectory = path.concat(getCurrentDate()+"/");
		return newDirectory;
	}

	public String folderLastModifiedDate(String lastModified) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM. MMM yy");
		String dateOnly = dateFormat.format(lastModified);
		return dateOnly;
	}
	


}
