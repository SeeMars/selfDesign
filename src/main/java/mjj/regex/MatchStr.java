package mjj.regex;

import java.util.regex.Pattern;

/**
 * @Author: majianjiong
 * @Date: 2023-02-14 11:37
 * @Version: 1.0.0
 **/
public class MatchStr {
    public static void main(String[] args) {
        String str="3D0P";
        String match="^3[A-Z][A-Z0-9]*";
        boolean matches = Pattern.matches(match, str);
        System.out.println(matches);
    }
}
