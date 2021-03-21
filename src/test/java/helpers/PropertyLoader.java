package helpers;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertyLoader {
    private static Properties prop;

    public static String loadProperty(String key) {
        if(Objects.isNull(prop)) {
            try(InputStream input = new FileInputStream("src/test/resources/config.properties")) {
                prop = new Properties();
                prop.load(input);
            } catch (Exception ex) {
                System.out.println("Couldn't load properties!!");
            }
        }
        return prop.getProperty(key);
    }
}
