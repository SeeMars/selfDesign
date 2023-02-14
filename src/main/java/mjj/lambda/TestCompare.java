package mjj.lambda;

import com.google.common.collect.Lists;
import mjj.dto.UserDto;

import java.util.Comparator;
import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2023-02-07 16:06
 * @Version: 1.0.0
 **/
public class TestCompare {

    public static void main(String[] args) {
        c1();
        c2();
    }

    public static void c1(){
        UserDto u=new UserDto("m1",1);
        UserDto u2=new UserDto("m2",2);
        UserDto u3=new UserDto("m3",3);
        UserDto u4=new UserDto("m4",3);
        List<UserDto> list= Lists.newArrayList(u,u2,u3);
        UserDto userDto = list.stream().max(Comparator.comparing(UserDto::getAge)).get();
        System.out.println(userDto);
    }

    static void c2(){
        UserDto u=new UserDto("m1",1);
        List<UserDto> list= Lists.newArrayList(u);
        UserDto userDto = list.stream().max(Comparator.comparing(UserDto::getAge)).get();
        System.out.println(userDto);

        List<UserDto> list2= Lists.newArrayList();
        UserDto userDto2 = list2.stream().max(Comparator.comparing(UserDto::getAge)).get();
        System.out.println(userDto2);

    }
}
