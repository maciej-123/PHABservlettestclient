import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/text_database");

        //GET_Requests g2 = new GET_Requests("https://phabservlet1.herokuapp.com/create_test_database");
        //GET_Requests g3 = new GET_Requests("https://phabservlet1.herokuapp.com/return_phab_paddington");

        String message = "gaviscon@chewable";
        String message2 = "cuprofen@max strength";

        String Branch1 = "Paddington";
        String Branch2 = "MileEnd";
        String Branch3 = "GreenPark";

       //put branch, manufacturer and name into servlet via post request
        POST_Requests P = new POST_Requests(Branch2,"https://phabservlet1.herokuapp.com/inputB");
        POST_Requests p2 = new POST_Requests(message2,"https://phabservlet1.herokuapp.com/inputMN");

        //search for drug example
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/searchForDrug");


        //getlimitone test
      //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/getLimitOne");

      //delete test
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/delete_phab");

//        GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/fill_phab");


        //test fill
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/testfill_phab");

        //test delete
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/testdelete_phab");

        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/replenishStock");

        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/calculateProfit");

        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/calculateRevenue");

        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/_checkStock");

        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/_decreaseStock");


        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/return_phab_mileend");
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/return_phab_greenpark");
        //GET_Requests g = new GET_Requests("https://phabservlet1.herokuapp.com/return_phab_paddington");

        //need reference to tutorial 6
        //System.out.println(g.returnText());
        //database_on_local_host_test dbtest = new database_on_local_host_test();
    }
}
