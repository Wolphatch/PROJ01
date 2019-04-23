package Welcome_JAVA;

public class functionality {
    public static void main(String[] args)
    {//通过对象调用方法
        functionality prt1 =new functionality();  //new表示类的实例化
        prt1.print2("Love"," Starlit");   //使用print2函数
    }


    String print(String x)        //返回值为String，
    {
        System.out.println(x);   //打印形式参数x
        return x;                //返回值x
    }

    void print2(String y,String z)   //返回值为String
    {
        functionality pt=new functionality();  //实例化，以使用上面print函数
        pt.print(y+z);
    }
    //修饰符 public；private同类（变量，方法，不能类）；default（缺省）；protected：同包类和子类（变量，方法）





}
