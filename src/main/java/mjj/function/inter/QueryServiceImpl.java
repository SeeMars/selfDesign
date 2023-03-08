package mjj.function.inter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2023-03-08 10:00
 * @Version: 1.0.0
 **/
public class QueryServiceImpl implements QueryService{
    @Override
    public List<Object[]> query(List<String> list) {
        System.out.println(list);
        List<Object[]> list1= Lists.newArrayList();
        Object[] o=new Object[list.size()];
        for(int i=0;i<list.size();i++){
            o[i]=list.get(i);
        }
        return list1;
    }
}
