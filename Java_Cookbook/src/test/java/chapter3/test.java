package chapter3;

import demo.chapter3.WordReverse;
import org.junit.Test;

import java.util.StringTokenizer;

/**
 * Created by LK on 2017/6/17.
 */
public class test {
    private String a = " Hello world~ a b c ! ";

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
    //使用toCharArray来用foreach遍历字符
    public void testForEachChar() {
        for (char s : a.toCharArray()) {
            System.out.println(s);
        }
    }

    @Test
    public void testReverseString() {
        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb.reverse());
    }

    @Test
    public void testWordReverse() {
        String a = "a b hello c d world";
        System.out.println(new WordReverse().reverse(a));
    }

    @Test
    //删除前置空格和制表符
    public void testTrim() {
        System.out.println(a.trim());

    }

    //todo 写一个扩展和压缩Tab

    //todo 一个简单的文本格式化工具
}
