package search;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.Calendar;

public class XlsxDataReader {
    protected XSSFSheet ExcelWSheet;
    protected XSSFWorkbook ExcelWBook;
    protected XSSFCell Cell;
    protected XSSFRow Row;

    public void setExcelFile(String path) throws Exception {
        try {
            FileInputStream ExcelFile = new FileInputStream(path);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
        } catch (Exception e){
            throw (e);
        }
    }
    public String[][] getExcelSheetData(String sheetname) throws Exception {
        String[][] data = null;
        String[][] mydata = null;
        if (ExcelWBook != null) {
            XSSFSheet sheet = ExcelWBook.getSheet(sheetname);
            if (sheet != null) {
                int rows = sheet.getLastRowNum();
                int cols = sheet.getRow(sheet.getLastRowNum()).getPhysicalNumberOfCells();
                int arrayrow = rows+1;
                data = new String[arrayrow][cols];
                mydata = new String[rows][cols];
                for (int i = 0; i < arrayrow; i++) {
                    for (int j = 0; j < cols; j++) {
                        org.apache.poi.ss.usermodel.Cell cell = sheet.getRow(i).getCell(j);
                        String cellData = cell.getStringCellValue();
                        data[i][j] = cellData;
                    }
                }
                // copied array to get rid of header row
                for(int m=0; m<rows; m++){
                    for (int n=0; n<cols; n++){
                        mydata[m][n] = data[m+1][n];
                    }
                }
            }
        }
        return mydata;
    }

    public String path;
    public FileInputStream fis = null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

    public XlsxDataReader(String path) {
        this.path = path;
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // returns the row count in a sheet
    public int getRowCount(String sheetName) {
        int index = workbook.getSheetIndex(sheetName);
        if (index == -1)
            return 0;
        else {
            sheet = workbook.getSheetAt(index);
            int number = sheet.getLastRowNum() + 1;
            return number;
        }
    }
    // returns the data from a cell
    public String getCellData(String sheetName, String colName, int rowNum) {
        try {
            if (rowNum <= 0)
                return "";
            int index = workbook.getSheetIndex(sheetName);
            int col_Num = -1;
            if (index == -1)
                return "";
            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                //System.out.println(row.getCell(i).getStringCellValue().trim());
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                    col_Num = i;
            }
            if (col_Num == -1)
                return "";
            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                return "";
            cell = row.getCell(col_Num);

            if (cell == null)
                return "";
            //System.out.println(cell.getCellType());
            if (cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)
                return cell.getStringCellValue();
            else if (cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC || cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_FORMULA) {

                String cellText = String.valueOf(cell.getNumericCellValue());
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    // format in form of M/D/YY
                    double d = cell.getNumericCellValue();

                    Calendar cal = Calendar.getInstance();
                    cal.setTime(HSSFDateUtil.getJavaDate(d));
                    cellText =
                            (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
                    cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +
                            cal.get(Calendar.MONTH) + 1 + "/" +
                            cellText;

                    //System.out.println(cellText);
                }
                return cellText;
            } else if (cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colName + " does not exist in xls";
        }
    }


}
