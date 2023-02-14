package mjj.dto;

import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2022-11-24 14:15
 * @Version: 1.0.0
 **/
public class UserDto {
    private String name;
    private int age;
    private List<String> list;
    public String getName() {
        return name;
    }

    public UserDto() {
    }

    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public UserDto(String name,int age,List<String> strings){
        this.name=name;
        this.age=age;
        this.list=strings;
    }
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}
