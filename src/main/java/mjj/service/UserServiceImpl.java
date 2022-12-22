package mjj.service;

import mjj.dto.UserDto;

/**
 * @Author: majianjiong
 * @Date: 2022-12-21 17:08
 * @Version: 1.0.0
 **/
public class UserServiceImpl implements UserService {

    @Override
    public UserDto getUserByName(String name) {
        UserDto userDto = new UserDto("matchName", 30);
        if (name.equals(userDto.getName())) {
            return userDto;
        }
        return null;
    }
}
