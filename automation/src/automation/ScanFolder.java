package automation;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ScanFolder {

	public ArrayList scanFolder(String path) {
//	public static void main(String[] args) {
//		String path = "\\\\SVRSG001RPS01.asia.corp.anz.com\\binanana$/Downloads/";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> arrayList = new ArrayList<>(); 
		
		for (File file : listOfFiles) {
			if (file.isFile()) {
//				System.out.println(file.getName());
				arrayList.add(file.getName());
			}
		}
//		System.out.println(arrayList);
		return arrayList;
	}

}
