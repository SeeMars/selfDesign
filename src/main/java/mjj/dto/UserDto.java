package mjj.dto;

/**
 * @Author: majianjiong
 * @Date: 2022-11-24 14:15
 * @Version: 1.0.0
 **/
public class UserDto {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public UserDto() {
    }

    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
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
                '}';
    }
}
