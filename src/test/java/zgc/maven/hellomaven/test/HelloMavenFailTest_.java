package zgc.maven.hellomaven.test;

import org.junit.Test;
import zgc.maven.hellomaven.HelloMaven;

import static org.junit.Assert.assertEquals;

/**
 *  guocheng.zhao
 *  2017/8/5 13:10
 *  13524779402
 *  guocheng.zhao@hand-china.com
 */
public class HelloMavenFailTest_ {
    @Test
    public void testSayHello(){
        String hello = HelloMaven.getHello();
        assertEquals("hello maven111!",hello);
    }
}
