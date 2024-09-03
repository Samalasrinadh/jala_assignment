// Q11: Write a program to write data to excel

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
    public static void main(String[] args) {
        try (Workbook wb = new XSSFWorkbook();
             FileOutputStream fos = new FileOutputStream("data.xlsx")) {
            Sheet sheet = wb.createSheet("Sheet1");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hello, Excel!");
            wb.write(fos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
