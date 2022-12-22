package mjj.service;

import mjj.dto.UserDto;

/**
 * @Author: majianjiong
 * @Date: 2022-12-21 17:07
 * @Version: 1.0.0
 **/
public interface UserService {
    UserDto getUserByName(String name);
}
