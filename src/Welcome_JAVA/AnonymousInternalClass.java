package Welcome_JAVA;

public class AnonymousInternalClass {
    public static void main(String[] args){
        //3.定义的接口的eat方法使用SubjectImpl实现
        /*
        ISubject test1=new SubjectImpl()；
        test1.eat();
        */


        //4. 2中的实现类只使用一次，有点浪费。所以将2改为匿名内部类
        //4(2). 匿名内部类只使用一次,现在将第二步注释掉，第六行SubjectImpl()变红
        //4(3). 在SubjectImpl()后面加上{}，直接在括号内部写实现方法，就叫做匿名内部类，写在下面：


        ISubject test2= new ISubject() {
            @Override
            public void eat() {
                System.out.println("吃，匿名内部类写法");
            }
        };

        test2.eat();


    }

}


//1.定义一个接口
interface ISubject{
    public abstract void eat();
}


/*
//2.接口实现类
class SubjectImpl implements ISubject{
    public void eat(){
        System.out.println("吃！");
    }
}
*/








