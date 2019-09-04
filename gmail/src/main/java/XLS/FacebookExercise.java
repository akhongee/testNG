package XLS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookExercise {

	public static void main(String[] args) throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("www.facebook.com");
		
		
		String sourcefile = "fb/facebook.xlsx";
		
			FileInputStream in = new FileInputStream(sourcefile);
				
				Workbook wb= new XSSFWorkbook(in);
				
				Sheet st= wb.getSheetAt(0);
				for (Row r:st) {
					
					for (Cell c:r) {
					
					switch(c.getCellType())	{
					case Cell.CELL_TYPE_STRING:
						
						
						System.out.print(c.getStringCellValue());
						break;
						
						case Cell.CELL_TYPE_NUMERIC:
							System.out.print(c.getNumericCellValue());	
							break;
							default:
								
					}
				
					
						System.out.println();
					}
				}
			}

		}
