package mjj.typeConvert;

import java.math.BigDecimal;

/**
 * @Author: majianjiong
 * @Date: 2023-02-24 15:44
 * @Version: 1.0.0
 **/
public class TypeConvertTest {
    public static void main(String[] args) {
        System.out.println(Integer.class.getTypeName());
        Integer a=10;
        BigDecimal bigDecimal=new BigDecimal(1);
        a=bigDecimal.intValue();
    }
}
