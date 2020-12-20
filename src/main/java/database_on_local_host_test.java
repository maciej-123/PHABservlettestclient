import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class database_on_local_host_test {
    //Reference: https://bb.imperial.ac.uk/webapps/blackboard/execute/content/file?cmd=view&content_id=_2019329_1&course_id=_24514_1

    private Connection c;
    private Statement s;
    private ResultSet rs;
    private String sqlStr;

    database_on_local_host_test()
    {
        String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println("Exception1");
        }

        try {
            c= DriverManager.getConnection(dbUrl, "postgres", "dGe3ju8aPk");
        }
        catch (Exception e){
            System.out.println("Exception2");
            e.printStackTrace();
        }

        try {
            s=c.createStatement();
            sqlStr = "SELECT * FROM test_database;";
            rs=s.executeQuery(sqlStr);
            while(rs.next()){
                System.out.println(rs.getInt("one"));
                System.out.println(rs.getInt("two"));
                System.out.println(rs.getInt("three"));
            }
            c.close();
        }
        catch (Exception e){
            System.out.println("Exception3");
            System.out.println(e.getMessage());
        }
    }



}
