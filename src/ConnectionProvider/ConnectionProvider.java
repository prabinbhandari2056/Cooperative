
package ConnectionProvider;
import java.sql.*;

/**
 *
 * @author Prabin Bhandari
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cooperativemanagementsystem","root","");
          
         return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
} 
