package Welcome_JAVA;
import java.math.*;
public class functionality_reload
{         //方法名称相同，变量个数，类型不同-->方法重载
    public static void main(String[] args)
    {
    functionality_reload sum=new functionality_reload();
    double a =sum.add(3.14,3);
    System.out.format("%.2f\n",a);

    String love=print_l("love","starlit");  //有static的方法可以直接调用，没有的化属于类方法，需要把类实例化
    System.out.print(love);
    }


    //求和
    int add(int x,int y)
    {
        int sum=x+y;
        return sum;
    }


    //变量个数不同

    int add(int x,int y,int z)
    {
        int sum=x+y+z;
        return sum;
    }


    //变量类型不同
    Double add(double x,int y)
    {
        double sum= x+(double)y;


        return sum;
    }

    //如果方法有static，main函数不用创建对象，可以直接调用
     public static String print_l(String x,String y)
    {
        
        String combination=x+y;
        return combination;
    }







}
