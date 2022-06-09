package automation;

import java.io.File;
import java.text.SimpleDateFormat;

public class GetFileData {
	
	public String getLastModified(String fileName) {
		
		String path = "\\\\\\\\SVRSG001RPS01.asia.corp.anz.com\\\\binanana$\\\\Desktop/";
		File file = new File(path+fileName);
		SimpleDateFormat sdf = new SimpleDateFormat("MM. MMM yy");
//		System.out.println(sdf.format(file.lastModified()));
		String lastModDate = sdf.format(file.lastModified());
		return lastModDate;

	}

}
