package menu;


import common.WebAPI;
import databases.ConnectToSqlDB;
import utility.DataReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DataSource extends WebAPI {


    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{

        String path = "/Users/abidur/Documents/SeleniumBootCampTeam2/Ebay/src/Data/Team2Framework.xlsx";
        String[] myStringArray = DataReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using the tag  add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }

}
