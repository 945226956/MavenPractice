package zgc.maven.hellomaven.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  guocheng.zhao
 *  2017/8/5 13:10
 *  13524779402
 *  guocheng.zhao@hand-china.com
 */
public class HelloMavenThrowExpTest_ {
    @Test
    public void testSayHello() throws Exception{
        throw new Exception("test fail!");
    }
}
