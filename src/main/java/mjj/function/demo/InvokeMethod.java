package mjj.function.demo;

import com.google.common.collect.Lists;
import mjj.function.MultiQuery;
import mjj.function.inter.QueryService;
import mjj.function.inter.QueryServiceImpl;

import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2023-03-08 10:22
 * @Version: 1.0.0
 **/
public class InvokeMethod {
    public static void main(String[] args) {
        QueryService queryService = new QueryServiceImpl();
        List<String> list = Lists.newArrayList();
        for (int i = 0; i < 15; i++) {
            list.add("" + i);
        }

        List<Object[]> objects = MultiQuery.testQueryBiFunction((param) -> queryService.query(param), list);
        System.out.println(objects);
    }
}
