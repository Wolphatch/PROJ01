package Welcome_JAVA;

/**
 * 非静态内部类,静态内部类
 * @author huzhicong
 */

public class internal_class {
    public static void main(String[] args){
        //外部类对象
        Outer o1=new Outer();
        //非静态内部类对象
        Outer.inner1 o2 = new Outer().new inner1();
        o2.show();
        //静态内部类对象
        Outer.inner2 o3=new Outer.inner2();
        o3.show();







    }


}

class Outer{

    private int age = 10;
    private int height = 100;
    public void test1(){

    }

    //非静态成员内部类，需要实例化才可使用
    class inner1{
        private int age=20;
        public void show(){
            //内部类可以访问外部类的成员（属性和方法），外部类不可以
            System.out.format("External variable age is : %d\n",Outer.this.age);
            System.out.format("Internal variable age is : %d",inner1.this.age);
        }
    }


    //静态成员内部类  StaticInnalClass
    static class inner2{
        static private int height=30;
        public void show(){
            System.out.format("Internal variable height is :",this.height);

        }
    }






}
