package third;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String path = "E:\\read.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
//		Cell cl = sh.getRow(2).getCell(0);
//		System.out.println(cl);
		
		int rCount =sh.getPhysicalNumberOfRows();
		int cCount =sh.getRow(0).getLastCellNum();
		System.out.println(rCount + "     " + cCount);
		 for (int row = 0; row < rCount; row++) {

			 for (int col = 0; col < cCount; col++) {
				 Cell cl = sh.getRow(row).getCell(col);
				System.out.println(cl.toString());
			}	}
	}
}
