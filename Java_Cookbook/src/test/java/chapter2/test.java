package chapter2;

import org.junit.Test;

import java.util.Properties;

/**
 * Created by LK on 2017/6/17.
 */
public class test {

    @Test
    //获取环境变量
    public void getEnv() {
        //Map<String,String> map =  System.getenv()
        System.out.println(System.getenv());
        System.out.println(System.getenv("PATH"));
    }

    @Test
    //获取系统属性信息
    public void getProperty() {
        Properties properties = System.getProperties();
//        System.out.println(properties.toString().replace(",", "\n"));//不知道有list(System.out)这种方法使用的笨蛋方法
        properties.list(System.out);
    }
}
