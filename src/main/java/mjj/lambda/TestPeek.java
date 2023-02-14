package mjj.lambda;

import com.google.common.collect.Lists;
import mjj.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: majianjiong
 * @Date: 2022-12-09 16:23
 * @Version: 1.0.0
 **/
public class TestPeek {
    public static void main(String[] args) {
        List<Integer> integers=Lists.newArrayList(1,2,3,4);

        final List<UserDto> userDtoList= Lists.newArrayList();
        integers.forEach(i->{
        UserDto userDto=new UserDto();
        userDto.setName("mjj"+i);
            userDtoList.add(userDto);
        });
         userDtoList.stream().map(u -> {
            u.setName("map");
            return u;
        }).collect(Collectors.toList());
//        userDtoList.stream().peek(u -> u.setName("peek")).forEach(System.out::println);
        System.out.println(userDtoList);
    }
}
