package automation;

import java.io.File;
import java.util.ArrayList;

public class ScanFolder {

	public ArrayList<String> scanFolder(String path) {

		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> arrayList = new ArrayList<>(); 
		
		for (File file : listOfFiles) {
			if (file.isFile()) {
				arrayList.add(file.getName());
			}
		}
		return arrayList;
	}

}
