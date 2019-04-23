package cn.wolph.j2;

public class test2 {
    public static void main(String[] args){
        test2 t2=new test2();
    }
    public test2(){   //构造器不要加void
        System.out.println("This is test2");
    }
    public  test2(int i){
        System.out.println(i);
    }
}
