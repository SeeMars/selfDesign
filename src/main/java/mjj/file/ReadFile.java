package mjj.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: majianjiong
 * @Date: 2022-12-01 11:40
 * @Version: 1.0.0
 **/
public class ReadFile {
    public static void main(String[] args) {
     new ReadFile().testFile();
    }

    public void testFile(){
        try {
            String path =this.getClass().getClassLoader().getResource("config.properties").getPath();
            InputStream inputStream=new FileInputStream(path);
            Properties properties=new Properties();
            try {
                properties.load(inputStream);
                Object url = properties.get("url");
                System.out.println(url);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
