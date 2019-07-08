package wrapper_class;

import java.lang.reflect.Type;

/**
 * @author huzhicong
 *
 * 将基本数据类型转化成wrapper class
 * byte-Byte,int-Integer,boolean-Boolean,short-Short,char-Character,long-Long,float-Float
 * double-Double
 */


public class lrnWrapperClass {
    public static void  main(String[] args){
        // two kinds of constractor  basic data type-->wrapper class
        Integer a = new Integer(3);
        float b = Float.valueOf(300);


        //wrapper----> basic data type
        int c = a.intValue();
        //or
        float d= b;
        //String-->Interger
        Integer f =Integer.parseInt("999999999");

    }




}
