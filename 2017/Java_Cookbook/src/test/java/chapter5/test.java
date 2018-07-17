package chapter5;

import demo.chapter5.Chapter5;
import org.junit.Test;

/**
 * Created by LK on 2017/6/19.
 */
public class test {

    @Test
    //测试正则表达式
    public void testMath() {
//        Math.***;
    }

    @Test
    public void testNumberProcess() {
        String s = "2.0";
        String s1 = "d";
        String s2 = "2f";
        String s3 = "E";
        String s4 = "2";

        Chapter5 chapter5 = new Chapter5();
        System.out.println(chapter5.process(s));
        System.out.println(chapter5.process(s1));
        System.out.println(chapter5.process(s2));
        System.out.println(chapter5.process(s3));
        System.out.println(chapter5.process(s4));

    }

    public void testPrecision() {
        double d = 123;
        double e = 0;
        if (d / e == Double.POSITIVE_INFINITY) {
            System.out.println("Check for POSITIVE_INFINITY works");
        }
        double s = Math.sqrt(-1);
        if (s == Double.NaN) {
            System.out.println("Comparison with NAN incorrectly returns true");
        }
        if (Double.isNaN(s)) {
            System.out.println("Double.isNaN() correctly returns true");
        }
    }

}

