package demo.chapter3;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by LK on 2017/6/18.
 */
public class WordReverse {
    /**
     * 将输入的内容根据单词倒序排序
     * @param input
     * @return
     */
    public String reverse(String input) {
        Stack<String> stack = new Stack<String>();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreElements()) {
            stack.push(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "a b hello c d world";
        System.out.println(new WordReverse().reverse(a));
    }
}
