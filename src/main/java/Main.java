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

        GET_Requests g2 = new GET_Requests("https://phabservlet1.herokuapp.com/create_test_database");
        GET_Requests g3 = new GET_Requests("https://phabservlet1.herokuapp.com/return_test_database");


        //System.out.println(g.returnText());
        //database_on_local_host_test dbtest = new database_on_local_host_test();
    }
}
