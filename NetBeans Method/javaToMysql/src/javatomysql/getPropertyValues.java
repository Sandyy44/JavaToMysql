package javatomysql;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Sandy Alaa
 */
public class getPropertyValues {
    String url = "";
    String user = "";
    String password = "";
   
    InputStream inputStream;

    @Override
    public String toString() {
        return url + "\n" + user + "\n" + password;
    }
    
    public void getPropValues() throws IOException {
        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            // get the property value and print it out
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            
            
            
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
    }
}
