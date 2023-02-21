package mjj.dto;

import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2023-02-14 13:58
 * @Version: 1.0.0
 **/
public class FatherUser {
    private List<UserDto> list;

    public List<UserDto> getList() {
        return list;
    }

    public void setList(List<UserDto> list) {
        this.list = list;
    }
}
