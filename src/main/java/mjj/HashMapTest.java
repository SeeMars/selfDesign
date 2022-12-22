package mjj;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

/**
 * @Author: majianjiong
 * @Date: 2022-12-07 16:43
 * @Version: 1.0.0
 **/
public class HashMapTest {
    public static void main(String[] args) {
        String jsonStr="{'key':'hello','key':'world'}";
        HashMap hashMap = JSONObject.parseObject(jsonStr, HashMap.class);
        System.out.println(hashMap.toString());
    }
}
