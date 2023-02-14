package mjj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: majianjiong
 * @Date: 2023-01-28 10:37
 * @Version: 1.0.0
 **/
public class DateTest {
    static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) {
        testCurrentYear("2021-01-01");
        addDays(new Date(),0);
    }

    /**
     * 判断当前日期是不是属于本年
     * @param date

     */
    static void testCurrentYear(String date){
        Date date1=new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date1);
        
        System.out.println(instance.getWeekYear());
        System.out.println(Calendar.getInstance().getWeekYear());
    }

    public static Date addDays(Date date,int days){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR,days);
        Date time = calendar.getTime();
        String format = sdf.format(time);
        System.out.println(format);
        return date;
    }
}
