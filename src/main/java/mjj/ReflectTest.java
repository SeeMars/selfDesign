package mjj;

import mjj.dto.UserDto;

/**
 * @Author: majianjiong
 * @Date: 2022-11-24 14:15
 * @Version: 1.0.0
 **/
public class ReflectTest {
    public static void main(String[] args) {

        UserDto user=new UserDto();
        try {
            UserDto.class.getMethod("getAge");
            UserDto.class.getMethod("getaa");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
