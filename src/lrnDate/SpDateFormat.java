package lrnDate;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串的互相转化
 * sampleDateFormat中的format（将日期转化为字符串）和parse（将字符串转化为日期）
 */
public class SpDateFormat {
    public static void  main (String[] args) throws ParseException {
        /**
         * create instence,format yyyy-MM-dd hh:mm:ss
         * out: 2019-07-08 08:39:23
         */
        DateFormat df1=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date dt=new Date();
        String str=df1.format(dt.getTime());
        System.out.println(str);

        /**
         * 将字符串转化为时间对象
         */
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date dt2 = df2.parse("2018年01月01日 15时12分11秒");
        System.out.println(dt2);

        /**
         * 测试今天是今年的第几天
         */

        DateFormat d=new SimpleDateFormat("D");
        String today=d.format(new Date());
        System.out.println(today);


    }
}
