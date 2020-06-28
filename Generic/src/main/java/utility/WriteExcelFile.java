package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    //private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";
    private static final String FILE_NAME = "F:\\SeleniumProject\\SeleniumBootCampTeam2\\at_t\\DataTest\\SearchItems.xlsx";
    public static void main(String[] args) { writeExcel(); }
    public static void writeExcel(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("login");

//        Object[][] stDetails = {
//                { "username", "password"},
//                { "Asiful", "A1234"},
//                { "Mezbah", "g2134"},
//                { "Tanjina", "t1234"},
//        };
                Object[][] stDetails = {
                {"Items"},
                {"iphone11"},
                {"apple watch"},
                {"s20 ultra"},
        };
        int rowNum = 0;
        System.out.println("Excel file Created");

        for (Object[] std : stDetails) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field:std) {
                Cell cell=row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(FILE_NAME);
            workbook.write(fileOutputStream);
            workbook.close();
        } catch (FileNotFoundException e){
            //System.out.println("File not found Exception");
            e.printStackTrace();
        } catch (IOException io){
            io.printStackTrace();
        }
        System.out.println("Done");
    }

}
