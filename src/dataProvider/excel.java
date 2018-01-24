package dataProvider;

import java.io.File;
import java.io.FileInputStream;

public class excel {
	public excel(String xlFilePath) throws Exception {
		File src = new File(xlFilePath);
		FileInputStream fis = new FileInputStream(src);
		Workbook workbook = new Workbook();
		
		
	}

}
