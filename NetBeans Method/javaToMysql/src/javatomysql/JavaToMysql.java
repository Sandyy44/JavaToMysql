package javatomysql;

//Setting up a connection between java and mysql database to get all data from a table
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy Alaa
 */
public class JavaToMysql {

    public static void main(String[] args) {
        //get database senstive information
        getPropertyValues properties = new getPropertyValues();
        try {
            properties.getPropValues();
        } catch (Exception e) {
            System.out.println("Error getting database information : " + e.getMessage());
        }

        String url = properties.url;
        String user = properties.user;
        String password = properties.password;

        System.out.println(user);
        System.out.println(password);
        System.out.println(url);

        String className = "com.mysql.cj.jdbc.Driver";

        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {

            
            Class.forName(className);
            connection = DriverManager.getConnection(url, user, password);
            

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
            statement = connection.createStatement();

            //change "hirawords" with your table name
            resultSet = statement.executeQuery("select * from hirawords");
            
            //change any of "english", "romaji", "hiragana", "paths", "hint" with your columns names
            String english;
            String romaji;
            String hiragana;
            String paths;
            String hint;
            while (resultSet.next()) {
                english = resultSet.getString("english").trim();
                romaji = resultSet.getString("romaji").trim();
                hiragana = resultSet.getString("hiragana").trim();
                paths = resultSet.getString("paths").trim();
                hint = resultSet.getString("hint").trim();

                System.out.println("english : " + english
                        + " romaji : " + romaji
                        + " hiragana : " + hiragana
                        + " paths : " + paths
                        + " hint : " + hint);

            }

        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();

                }
            } catch (Exception e) {
                System.out.println("Error closing ResultSet: " + e.getMessage());
            }

            try {
                if (connection != null) {
                    connection.close();

                }
            } catch (Exception e) {
                System.out.println("Error closing ResultSet: " + e.getMessage());
            }
            try {
                if (statement != null) {
                    statement.close();

                }
            } catch (Exception e) {
                System.out.println("Error closing ResultSet: " + e.getMessage());
            }
        }

    }

}
