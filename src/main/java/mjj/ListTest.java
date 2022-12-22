package mjj;

import com.google.common.collect.Lists;
import mjj.dto.UserDto;
import org.apache.commons.collections.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: majianjiong
 * @Date: 2022-11-17 16:25
 * @Version: 1.0.0
 **/
public class ListTest {

    public static void main(String[] args) {
        testRemove();
        testSwtich();
        List<String> list = Lists.newArrayList("1", "2", "3", "3", "4");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("3")) {
                iterator.remove();
            }
        }
        System.out.println(list);
        testDuplicate();
    }

    public static void testDuplicate() {
        UserDto userDto = new UserDto();
        userDto.setName("mjj");
        List<UserDto> list = new ArrayList<>();
        list.add(userDto);
        UserDto userDto1 = new UserDto();
        userDto1.setName("mjj");
        list.add(userDto1);
        list = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(()
                -> new TreeSet<>(Comparator.comparing(UserDto::getName))), ArrayList::new));
        System.out.println(list);
    }

    public static void testSwtich() {
        String s = "bb";
        switch (s) {
            case "bb":
                System.out.println("bb");
            case "aa":
                System.out.println("aaa");
            case "cc":
                System.out.println("cc");
            default:
                System.out.println("end");
                break;
        }
    }


    public static void testRemove() {
        List<String> list = Lists.newArrayList("1", "2", "3", "4");
        List<String> removeList = Lists.newArrayList("1", "2");
        Collection collection = CollectionUtils.removeAll(list, removeList);
        System.out.println(collection);
    }
}