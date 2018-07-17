package demo.chapter5;

/**
 * Created by LK on 2017/8/5.
 */
public class Chapter5 {
    private static final Number NAN = Double.NaN;

    public Number process(String s) {
        if (s.matches("[+-]*\\d*\\.\\d+[dDeEfF]]*")) {
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                return NAN;
            }
        } else {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return NAN;
            }
        }
    }
}
