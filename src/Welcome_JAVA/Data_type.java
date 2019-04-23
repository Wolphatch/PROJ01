package Welcome_JAVA;

import java.math.BigDecimal;
import java.text.Bidi;

public class Data_type {
    public static void main(String[] args)
    {
        /**
        char a='a';   // 字符型 4byte -128-127
        byte b=1;    //byte 1
        short c=12;  //short 2byte
        int d=1234;  //int 4 byte
        long e=1234567890L;  //long 8 byte
        int f=0x113214;   // 在初始化之后，改变f的值不需要再次声明int
        System.out.println(f);   //16进制
        double i=13.12123;   //double，末尾不需要申明



        float h=131287987912F;   //float 7位有效数字,末尾需要F

        float h2=h+1;

        if(h==h2){
            System.out.println("h=h2");  //输出h=h2说明浮现数不精确
        }
        else {
            System.out.println("h!=h2");

        }

        double j= 232148013;
        double j1=j+1;
        if(j==j1){
            System.out.println("j=j1");  //这说明double比较精确，但也用double不比较
         //可以使用java.math.BigInteger and java.math.BigDecimal;
        /*/

        /**
        BigDecimal bd=BigDecimal.valueOf(1);
        bd=bd.subtract(BigDecimal.valueOf(0.1));
        bd=bd.subtract(BigDecimal.valueOf(0.1));
        bd=bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);    //0.7
        System.out.println(1-0.1-0.1-0.1);   //0.70000000000000000001


        BigDecimal bd1=BigDecimal.valueOf(0.1);
        bd1=bd1.add(BigDecimal.valueOf(0.2));
        System.out.println(bd1);
        /*/

        char f='f';
        char ff='a';
        System.out.println(""+'f'+'\n'+"ff");
        System.out.println(" "+'\t'+ff);
    }
}
