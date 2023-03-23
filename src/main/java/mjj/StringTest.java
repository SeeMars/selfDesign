package mjj;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: majianjiong
 * @Date: 2022-11-03 15:19
 * @Version: 1.0.0
 **/
public class StringTest {
    public static void main(String[] args) {
        String s = montageParam(Lists.newArrayList("1", "2", "3"));
        System.out.println(s);
        List<String> list=new ArrayList<>();
        list.add("1234556");
        List<String> list1 = modifySapCode(list);
        System.out.println(list1);
        testSubString();
        System.out.println(String.format("test[%s]","值"));
        String a="12345";
        System.out.println(StringUtils.substring(a,0,2));
        parseJSONStr();
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

    public static List<String> modifySapCode(List<String> sapCodes) {
        List<String> list= Lists.newArrayList();
        sapCodes.forEach(s -> {
            //如果是纯数字
            if (StringUtils.isNumeric(s)) {
                if (s.length() < 10) {
                    //计算需要补位几个0
                    int count = 10 - s.length();
                    for (int i = 0; i < count; i++) {
                        s = "0" + s;
                    }
                }
                list.add(s);
            }
        });
        return sapCodes;

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
        System.out.println("testSubString 方法执行结果:");
       StringBuffer s=new StringBuffer("abcdec H1,H1,qw");
       s.delete(s.lastIndexOf(","),s.lastIndexOf(",")+1);
        System.out.println(s);
//        String h1 = StringUtils.substring(s.toString(), 0,s.lastIndexOf("H1"));
//        System.out.println(h1);
//        s=new StringBuffer(h1);
//        String substring = s.substring(s.lastIndexOf("H1"));
//        System.out.println(substring);

        s.insert(s.indexOf("H1")+2,"(");
        System.out.println(s);
        //测试截取超出长度的字段
        String substring = s.substring(0,4);
        System.out.println(substring);
    }
    
    static void parseJSONStr(){
        String str="[\"X007\",\"X006\",\"X005\",\"X004\",\"X003\"]";
        List list = JSONObject.parseObject(str, List.class);
        StringBuffer stringBuffer=new StringBuffer();
        list.stream().forEach(o->{
            o=o+"2";
            stringBuffer.append(o);
        });
        System.out.println(stringBuffer);
    }

    /**
     * 拼接 SQL 查询  in 的参数
     * @param params
     * @return
     */
    private static String montageParam(List<String> params){
            StringBuffer buffer = new StringBuffer();
            buffer.append(" (");
            for(String s:params){
                buffer.append("'");
                buffer.append(s);
                buffer.append("',");
            }
            buffer.append(") ");
            buffer.delete(buffer.lastIndexOf(","),buffer.lastIndexOf(",")+1);
            return buffer.toString();
        }
}