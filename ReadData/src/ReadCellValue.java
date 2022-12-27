import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellValue {
	
	public static void main(String[] args) {
		
		ReadCellValue rc=new ReadCellValue();     
		 
		String Output=rc.ReadCellData(3, 0);  
		
		System.out.println(Output);  
		
	}  
		
		public String ReadCellData(int Row, int Column)  
		{  
				String value =null;       
		        Workbook wb=null;
		        
		        try {	
		        	
		       	FileInputStream fis=new FileInputStream("C:\\\\Users\\\\gopal naik\\\\OneDrive\\\\Documents\\\\Student.xlsx");

		         wb = new XSSFWorkbook(fis);	
				
		        
		        } 
		        
		        catch (FileNotFoundException e) {
				
					e.printStackTrace();
					
				}
		        catch(IOException e1){  
				
					e1.printStackTrace();  
					
				}
		        
		        Sheet sheet = wb.getSheetAt(0);
		        Row row = sheet.getRow(Row);
		        Cell cell = row.getCell(Column);
		        String value2 = cell.getStringCellValue();
		        
		        return value2;
		        
		}
	    

		

}
