package Welcome_JAVA;

public class TestSuper {
    public static  void  main(String [] args){
        new ChildClass().f();
    }
}

class FatherClass{
    public int value;

    public void f(){
        value=1000;
        System.out.println("Father.value="+value);
    }
}

class ChildClass extends FatherClass{
    public  int value; //等于重写了value

    public void f(){
        super.f();  //改变的是super.value的值
        value=200;
        System.out.println("Childclass.value="+value);
        System.out.println(value);
        System.out.println(super.value);

    }
}



/*
Father.value=1000  子类继承了父类，但子类的value和父类的value不同，父类的value在这里表示是super.value
Childclass.value=200 子类打印子类value
200
1000  super。value代表父类value
 */