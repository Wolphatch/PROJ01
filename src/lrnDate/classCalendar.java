package lrnDate;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

/**
Calendar   提供日期计算，是一个抽象类
 子类是GregorianCalendar
 */

public class classCalendar {
    public static void main(String[] args){
        /**
         * 一月是0
         * 实例化并获取实例年份
         */
        Calendar calendar=new GregorianCalendar(2020,6,8,15,21,12);
        Calendar calendar2=new GregorianCalendar(2019,6,8,15,21,12);


        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH);
        int week=calendar2.get(calendar2.DAY_OF_WEEK);
        int day=calendar2.get(calendar2.DATE);//这个月几号

        System.out.println(year);
        System.out.println(month);
        System.out.println(week);
        System.out.println(day);

        boolean ifEarlier=calendar2.before(calendar);
        System.out.println(ifEarlier);




        /**
         * 设置日期相关元素
         */

        Calendar c2=new GregorianCalendar();
        c2.set(c2.YEAR,8012);
        System.out.println(c2.get(c2.DAY_OF_YEAR));


        /**
         * 日期计算
         */

        Calendar c3=new GregorianCalendar();
        c3.add(c3.DATE,100);
        System.out.println(c3.get(c3.DAY_OF_YEAR));


    }
}
