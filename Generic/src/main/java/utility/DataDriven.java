package utility;
import databases.ConnectToSqlDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Mahmud
 */
public class DataDriven {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    // Insert Data from into Database
    public static void insertDataIntoDB() {
        //List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"ItemList","items");
    }
    //  From Class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Deals");
        itemsList.add("i phone 11 pro max");
        itemsList.add("apple Watch");
        itemsList.add("Speakers");
        itemsList.add("internet");
        itemsList.add("wireless");
        return itemsList;
    }
    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }
    //Excel file
    public static List<String> getItemsListFromExcel(String path) throws Exception, IOException, SQLException, ClassNotFoundException {

        //String path = "../Generic/src/main/java/utility/CnnDataReadFromExcel1.xls";
//        String path = "../Amazon/DataTest/AmazonDataReadFromExcel.xls";

        String[] myStringArray = excelReader.fileReader2(path, 0);
        for (int i = 1; i < myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }
}
