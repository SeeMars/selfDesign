package mjj.lambda;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2022-11-28 16:01
 * @Version: 1.0.0
 **/
public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> list= Lists.newArrayList();
        for(int i=0;i<100000;i++){
            list.add(i);
        }
        List<Integer> synList=Lists.newArrayList();
        Long start=System.currentTimeMillis();
       synList= Collections.synchronizedList(synList);
        List<Integer> parralleList= Lists.newCopyOnWriteArrayList();
        list.parallelStream().forEach(synList::add);
        System.out.println(parralleList.size());
        System.out.println(synList.size());
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
//    public static  void testComparator(){
//        Comparator.comparing()
//    }
}
