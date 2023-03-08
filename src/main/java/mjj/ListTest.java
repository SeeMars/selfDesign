package mjj;

import com.google.common.collect.Lists;
import mjj.constant.ExtendRuleEnum;
import mjj.dto.FatherUser;
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
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        subList();
//        testSwtich();
//        testMapToList();
//        emptylistToMap();
//        testUserListDistinct();
//        testRemove();
//        List<String> list = Lists.newArrayList("1", "2", "3", "3", "4");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().equals("3")) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//        testDuplicate();
//        testDel();
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
        String s = "cc";
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

    /**
     * 去除对象里的集合字段的重复值
     */
    public static void testUserListDistinct(){
        UserDto userDto=new UserDto("n",1,Lists.newArrayList("1","2","3","2"));
        userDto.getList().stream().distinct().collect(Collectors.toList());
        System.out.println(userDto);
        userDto.setList(userDto.getList().stream().distinct().collect(Collectors.toList()));
        System.out.println(userDto);
    }

    /**
     * 测试循环删除
     */
    public static void testDel(){
        FatherUser fatherUser=new FatherUser();
        fatherUser.setList(UserDto.getUserList());
        //异常  ConcurrentModificationException
//        for(UserDto u:fatherUser.getList()){
//            if(u.getName().equals("mjj"))
//                fatherUser.getList().remove(u);
//        }
        remove(fatherUser);

        System.out.println(fatherUser.getList());
    }
    static void remove(FatherUser fatherUser){
        Iterator<UserDto> iterator = fatherUser.getList().iterator();
        while (iterator.hasNext()){
            UserDto next = iterator.next();
            if(next.getName().equals("mjj"))
                iterator.remove();
        }
    }

    /**
     * 空集合转map
     */
    static void emptylistToMap(){
        List<UserDto> list=new ArrayList<>();
        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(UserDto::getName, UserDto::getAge));
        System.out.println(collect);
    }

    static void testMapToList(){
        Map<String,String> map=new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        Collection<String> values = map.values();
        List<String> list=new ArrayList<>(values);
        System.out.println(list);
    }

    static void subList(){
        List<String> list=Lists.newArrayList("1","2","3","4","5","6","7");
        for(int i=0;i<list.size();i=i+2){

            int endIndex=i+2;
            if(endIndex>=list.size()){
                endIndex=list.size();
            }
            List<String> list1 = list.subList(i, endIndex);

            System.out.println(list1);
        }
//        list.subList()
    }
}
