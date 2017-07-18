package chapter4;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by LK on 2017/6/19.
 */
public class test {

    @Test
    //测试正则表达式
    public void testRegular() {
        String pattern = "^Q[^u]\\d+\\.";
        String[] input = {
                "Qa890. bala bala",
                "Quack, bala bala"
        };
        Pattern p = Pattern.compile(pattern);
        for (String s : input) {
            boolean found = p.matcher(s).lookingAt();
            System.out.println(pattern + "\t" + (found ? "true" : "false") + "\t" + s);
        }
    }
}
