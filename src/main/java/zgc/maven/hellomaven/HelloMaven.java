package zgc.maven.hellomaven;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 *  guocheng.zhao
 *  2017/8/5 13:10
 *  13524779402
 *  guocheng.zhao@hand-china.com
 */
public class HelloMaven {
    public static String getHello() {
        return "hello maven!";
    }

    public static void main(String[] args) throws Exception {
        /*获取classpath下的文件*/
        Properties pro = new Properties();
        InputStream inStream = HelloMaven.class
                .getResourceAsStream("/conf.properties");
        try {
            pro.load(inStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String words = pro.getProperty("chinese");
        words = new String(words.getBytes("ISO-8859-1"), "UTF-8");//转码
        System.out.println(words);
//        System.out.println(getHello());
    }
}
