package mjj.function.inter;

import java.util.List;

/**
 * @Author: majianjiong
 * @Date: 2023-03-08 09:59
 * @Version: 1.0.0
 **/
public interface QueryService {
    List<Object[]> query(List<String> list);
}
