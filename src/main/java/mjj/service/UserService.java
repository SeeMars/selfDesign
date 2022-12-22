package mjj.service;

import mjj.dto.UserDto;

/**
 * @Author: majianjiong
 * @Date: 2022-12-21 17:07
 * @Version: 1.0.0
 **/
public interface UserService {
    /**
     * 通过名称获取
     * @param name
     * @return
     */
    UserDto getUserByName(String name);
}
