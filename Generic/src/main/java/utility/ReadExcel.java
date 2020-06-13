package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";



    /**
     * This method is to read Excel file based on sheet Index Number
     *
     *
     *
     *
     */
    public static void readExcelFile() {
        try {
            FileInputStream inputStream = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + " ");

                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue());
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }

    }




}