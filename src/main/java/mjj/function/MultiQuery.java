package mjj.function;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Author: majianjiong
 * @Date: 2023-03-08 09:49
 * @Version: 1.0.0
 **/
public class MultiQuery<T, R> {
    private static final Integer QUERY_SIZE = 5;

    private static <T> List<T> getSubQuery(List<T> list, int index) {
        int endIndex = index + QUERY_SIZE;
        if (endIndex >= list.size()) {
            endIndex = list.size();
        }
        return list.subList(index, endIndex);
    }

    public static <T> List<Object[]> testQueryBiFunction(Function<List<T>, List<Object[]>> function,
                                                         List<T> queryList) {
        List<Object[]> objects = Lists.newArrayList();
        for (int i = 0; i < queryList.size(); i = i + QUERY_SIZE) {
            List<T> subQuery = getSubQuery(queryList, i);
            List<Object[]> result = function.apply(subQuery);
            objects.addAll(result);
        }
        return objects;
    }

    public static <T, K> List<Object[]> multiQueryWithIn(BiFunction<List<T>, K, List<Object[]>> biFunction,
                                                         List<T> queryList, K obj) {
        List<Object[]> objects = new ArrayList<>();
        for (int i = 0; i < queryList.size(); i = i + QUERY_SIZE) {
            int endIndex = i + QUERY_SIZE;
            if (endIndex >= queryList.size()) {
                endIndex = queryList.size();
            }
            List<T> subQuery = queryList.subList(i, endIndex);
            List<Object[]> result = biFunction.apply(subQuery, obj);
            objects.addAll(result);
        }
        return objects;
    }
}
