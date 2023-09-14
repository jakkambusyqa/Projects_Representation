package com.Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

public class Utils {
	@DataProvider

	public String[][] setdata() throws Throwable {

		File file = new File("./src/main/java/com/testdata/Registration data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rows - 1][columns];

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < columns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		return data;
	}
	

}
