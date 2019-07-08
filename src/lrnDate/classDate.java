package lrnDate;
import java.util.Date;
/**
 * date
 */
public class classDate {
    public static void main(String[] agrs){
        Date dt=new Date();

        //curtime would be printed if print dt
        System.out.println(dt);

        //give time
        Date dt2=new Date(2000);


        //get systemtime
        Date cur=new Date();
        System.out.println(cur.getTime());


        //judge whether curtime is after dt2
        /**
         * 源码中，使用getMillisOf获取毫秒数来做比较
         */
        System.out.println(cur.after(dt2));





    }

}
