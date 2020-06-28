package homepage;

import common.WebAPI;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class Database extends WebAPI {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

//    public static void insertDataIntoDB() {
//        List<String> list = getHeaderValue();
//        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//       // connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "search_items", "itemlists");
//    }
////    public static List<String> getHeaderValue() {
////        List<String> search = new ArrayList<String>();
////        search.add("iphone11");
////        search.add("Deals");
////        search.add("Accesories");
////        return search;
////    }
    public List<String> getUserDatafromDB() throws Exception {
        //  TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        list = ConnectToSqlDB.readDataBase("Geico", "option");
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //insertDataIntoDB();
        List<String> list = connectToSqlDB.readDataBase("Geico", "option");
        for (String st : list) {
            System.out.println(st);
        }
    }














}
