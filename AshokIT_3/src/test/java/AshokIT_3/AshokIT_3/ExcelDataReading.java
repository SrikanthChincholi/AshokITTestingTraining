package AshokIT_3.AshokIT_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReading {

	static String filepath = ".//DataFiles//DataFile.xlsx";
	static FileInputStream fis;

	public static void main(String[] args) throws Exception {
		readDataFromExcel2();
		System.out.println("********************************");
		readDataFromExcel1();
	}

	public static void readDataFromExcel1() throws Exception {
		fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int noofrows = sh.getPhysicalNumberOfRows();
		int noofcols = sh.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < noofrows; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < noofcols; j++) {
				Cell cell = row.getCell(j);
				if (CellType.STRING == cell.getCellType()) {
					System.out.print(cell.getStringCellValue() + " ");
				} else if (CellType.NUMERIC == cell.getCellType()) {
					System.out.print(cell.getNumericCellValue() + " ");
				} else if (CellType.BOOLEAN == cell.getCellType()) {
					System.out.print(cell.getBooleanCellValue() + " ");
				}
			}
			System.out.println("");
		}

		wb.close();
		fis.close();
	}

	public static void readDataFromExcel2() throws Exception {
		fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int noofrows = sh.getPhysicalNumberOfRows();
		int noofcols = sh.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < noofrows; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < noofcols; j++) {
				Cell cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(cell);
				System.out.print(data + " ");
			}
			System.out.println("");
		}

		wb.close();
		fis.close();
	}

}
