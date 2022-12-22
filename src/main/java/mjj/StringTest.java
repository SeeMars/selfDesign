package mjj;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2022-11-03 15:19
 * @Version: 1.0.0
 **/
public class StringTest {
    public static void main(String[] args) {
        System.out.println(String.format("test[%s]","值"));
        testSubString();
//        testChar();
//        System.out.println(StringUtils.replace("sad", "_", ""));
//        String tem="asdwwweee";
//        for(int i=0;i<2;i++){
//            testContains(tem);
//        }
//        System.out.println(tem);
    }

    public static void testContains(String str) {
        str=StringUtils.replace(str,"w","",1);
        System.out.println(str);
    }


    public static void testChar() {
        String str = "sad";
        str = StringUtils.replace(str, "_", "");
        List<StringBuffer> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 65 && chars[i] <= 90) {
                StringBuffer sb = new StringBuffer();
                sb.append(chars[i]);
                list.add(sb);
            } else {
                if (i == 0) {
                    list.add(new StringBuffer(chars[i]));
                } else {
                    list.get(list.size() - 1).append(chars[i]);
                }
            }
        }
        System.out.println(list);
    }

    public static void testSubString(){
       StringBuffer s=new StringBuffer("abcdec H1,H1");
       s.delete(s.lastIndexOf("H1"),s.length());
        System.out.println(s);
//        String h1 = StringUtils.substring(s.toString(), 0,s.lastIndexOf("H1"));
//        System.out.println(h1);
//        s=new StringBuffer(h1);
//        String substring = s.substring(s.lastIndexOf("H1"));
//        System.out.println(substring);

        s.insert(s.indexOf("H1")+2,"(");
        System.out.println(s);
    }
}