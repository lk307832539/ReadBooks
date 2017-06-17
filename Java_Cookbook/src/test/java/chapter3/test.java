package chapter3;

import org.junit.Test;

import java.util.StringTokenizer;

/**
 * Created by LK on 2017/6/17.
 */
public class test {
    String a = "Hello word";

    @Test
    public void testSubString() {
        String a = "asdfj;algajkasuifoq;z,nv;huta";
        String b = a.substring(5);
        String c = a.substring(7, 12);
        System.out.println(a + "\b" + b + "\n" + c);
    }

    @Test
    //StringTokenizer 按照单词边界划分字符串
    public void testStringTokenizer() {
        String a = "Hello everyone HAHAHA!";
        StringTokenizer st = new StringTokenizer(a);
        while (st.hasMoreElements()) {
            System.out.println("Token:" + st.nextToken());
        }

        String b = "Hel|lo every|one HA|HA|HA!";
        StringTokenizer st2 = new StringTokenizer(b, "|");
        while (st2.hasMoreElements()) {
            System.out.println("Token:" + st2.nextToken());
        }
    }

    @Test
    public void testForEachChar() {
        for (char s : a.toCharArray()) {
            System.out.println(s);
        }
    }

}
