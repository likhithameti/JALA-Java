package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel. * ;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program11 {
  public static void main(String[] args) {
    //Blank workbook
    XSSFWorkbook workbook = new XSSFWorkbook();

    //Create a blank sheet
    XSSFSheet sheet = workbook.createSheet("Product data");

    //This data needs to be written (Object[])
    Map< String,Object[] > data = new TreeMap< String,Object[]> ();
    data.put("1", new Object[] {
      "ID",
      "NAME",
      "PRICE"
    });
    data.put("2", new Object[] {
      1,
      "Mouse",
      1000
    });
    data.put("3", new Object[] {
      2,
      "Keyboard",
      1200
    });

    Set < String > keyset = data.keySet();
    int rownum = 0;
    for (String key: keyset) {
      Row row = sheet.createRow(rownum++);
      Object[] objArr = data.get(key);
      int cellnum = 0;
      for (Object obj: objArr) {
        Cell cell = row.createCell(cellnum++);
        if (obj instanceof String) cell.setCellValue((String) obj);
        else if (obj instanceof Integer) cell.setCellValue((Integer) obj);
      }
    }
    try {
      //Write the workbook in file system
      FileOutputStream out = new FileOutputStream(new File("Product.xlsx"));
      workbook.write(out);
      out.close();
      
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}