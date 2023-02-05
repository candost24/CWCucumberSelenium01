package utilitis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static{//öncelikli olarak static bloklar çalışır
        String filePath="config.properties";
        try {
            FileInputStream fis=new FileInputStream(filePath);

            properties=new Properties();
            properties.load(fis);

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
