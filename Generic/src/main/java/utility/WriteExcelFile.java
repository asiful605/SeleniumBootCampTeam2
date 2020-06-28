package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

  // private static final String FILE_NAME = System.getProperty("/Users/kahinaayouni/IdeaProjects/SeleniumBootCampTeam2/DataTest/logIn.xlsx");

    private static final String FILE_NAME = "GEICO/DataTest/file.xlsx";

    public static void main(String[] args)  {
        writeExcel();
    }

    public static void writeExcel()  {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("login");

        Object[][] stDetails = {
                {"Id", "password"},
                {"Anika", "test1234"},
                {"Mahid", "test4567"},
                {"Asif", "test6321"},
                {"Mezbah", "test7890"},
                {"kahina", "test45091"},
                {"Kenzy", "test5444467" }
        };

        int rowNum = 0;
        System.out.println("Excel file Created");

        for (Object[] lg : stDetails) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;

            for (Object field:lg) {
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
            System.out.println("File not found Exception");
            e.printStackTrace();

        } catch (IOException io){
            io.printStackTrace();
        }
      System.out.println("Done");



    }


}
