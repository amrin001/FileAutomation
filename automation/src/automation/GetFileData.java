package automation;

import java.io.File;
import java.text.SimpleDateFormat;

public class GetFileData {

	public String getLastModified(String path, String fileName) {

		File file = new File(path + fileName);
		SimpleDateFormat sdf = new SimpleDateFormat("MM. MMM yy");
		String lastModDate = sdf.format(file.lastModified());
		return lastModDate;

	}

}
