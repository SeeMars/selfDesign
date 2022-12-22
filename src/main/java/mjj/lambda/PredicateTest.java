package mjj.lambda;

import mjj.dto.UserDto;

import java.util.function.Predicate;

/**
 * @Author: majianjiong
 * @Date: 2022-12-06 15:35
 * @Version: 1.0.0
 **/
public class PredicateTest<T> {

    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        userDto.setName("mjj");
        userDto.setAge(22);

//        System.out.println(matchUser(u->u.getName().equals("mjj"),userDto));
//        System.out.println(matchUser(new Predicate<UserDto>() {
//            @Override
//            public boolean test(UserDto userDto) {
//                if(userDto.getAge()==1&&userDto.getName().equals("mjj")){
//                    return true;
//                }
//                return false;
//            }
//        }, userDto));
        UserDto dto = find(matchUserByName(), userDto);
        System.out.println(dto);
    }

    public static UserDto find(Predicate<UserDto> predicate, UserDto userDto) {
        return predicate.test(userDto) ? userDto : null;
    }

    public static Predicate<UserDto> matchUserByName() {
        return new Predicate<UserDto>() {
            @Override
            public boolean test(UserDto userDto) {
                return userDto.getName().equals("mjj");
            }
        };
    }

    public static Predicate<UserDto> matchByAge() {
        return new Predicate<UserDto>() {
            @Override
            public boolean test(UserDto userDto) {
                return userDto.getAge() == 22;
            }
        };
    }
}
