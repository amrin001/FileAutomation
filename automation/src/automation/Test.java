package automation;

import java.io.File;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		String path = "\\\\SVRSG001RPS01.asia.corp.anz.com\\binanana$/Desktop/";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> arrayList = new ArrayList<>(); 
		
		for (File file : listOfFiles) {
			if (file.isFile()) {
				arrayList.add(file.getName());
			}
		}
		for (int i=0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}


