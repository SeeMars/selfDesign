package mjj.lambda;

import com.google.common.collect.Lists;
import mjj.constant.ExtendRuleEnum;
import mjj.dto.UserDto;
import mjj.service.UserService;
import mjj.service.UserServiceImpl;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: majianjiong
 * @Date: 2022-12-21 15:14
 * @Version: 1.0.0
 **/
public class FlatMapTest {
    static UserDto u1 = new UserDto("mjj", 11);
    static UserDto u2 = new UserDto("mjj2", 22);
    static UserDto u3 = new UserDto("mjj3", 33);
    static List<UserDto> userDtoList = Lists.newArrayList(u1, u2, u3);

    static UserDto u4 = new UserDto("mjj4", 123123);
    static UserDto u5 = new UserDto("mjj5", 41424);
    static List<UserDto> list2 = Lists.newArrayList(u4, u5);
   static UserService userService=new UserServiceImpl();
    public static void main(String[] args) {
        enumFlatMap();
        flatMap1();
        flatIntMap();
    }

    static void flatMap1() {
        List<List<UserDto>> fatherList = Lists.newArrayList(userDtoList, list2);
        List<UserDto> collect = fatherList.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
        //垃圾用法
        List<String> name1 = fatherList.stream().flatMap(a -> a.stream()).collect(Collectors.toList()).stream().map(UserDto::getName).collect(Collectors.toList());
        List<String> name2 = fatherList.stream().flatMap(a -> a.stream().map(UserDto::getName)).collect(Collectors.toList());
        List<Integer> ageList = fatherList.stream().flatMapToInt(a -> a.stream().mapToInt(b -> b.getAge())).boxed().collect(Collectors.toList());
        System.out.println(collect.toString());
        System.out.println(name1.toString());
        System.out.println(name2);
        System.out.println(ageList);
    }

    static void flatIntMap() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> list2 = Lists.newArrayList(4, 5, 6, 7, 8);
        List<List<Integer>> father = Lists.newArrayList(list, list2);
        List<Integer> collect = father.stream().flatMapToInt(a -> a.stream().mapToInt(Integer::intValue)).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
    static void enumFlatMap(){
        List<String> companyCodes = ExtendRuleEnum.getCompanyCodes();
        System.out.println(companyCodes);
    }
    /**
     * 测试flatMap对stream集合流里的参数匹配
     */
    public static void testFunction(){
        List<List<UserDto>> fatherList = Lists.newArrayList(userDtoList, list2);

    }
}
