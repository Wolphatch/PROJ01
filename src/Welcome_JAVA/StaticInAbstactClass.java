package Welcome_JAVA;

public class StaticInAbstactClass {
    //在抽象类中使用static返回抽象类实例对象
    public static void main(String[]  args){
        Subject.getSubject().eat3();
    }


}



abstract  class Subject{
    //抽象方法
    abstract void eat3();
    //使用static返回抽象类实例对象
    public static Subject getSubject(){
        //返回Subject的对象
        return new Subject() {
            public void eat3(){
                System.out.println("开吃！");
            }

        };
    }

}