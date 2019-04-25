package Welcome_JAVA;



public class java_extend {
    public static void main(String[] args){

        Person wolph=new Person("wolph");

        Student mark=new Student("mark",1001); //子类可以选择执行自己的构造器，但是父类构造器仍会初始化
        Student koi=new Student(0001);

        mark.rest(); //子类执行父类的方法
        mark.name="mark"; //拥有父类成员变量
        koi.study();    //子类实例执行子类方法
        //mark.height;    //由于Person类里的height被设为私有，子类实例无法访问
        //wolph.height;   //父类实例也无法方位private属性
        System.out.println(mark.name);
    }
}



class Person{
    String name;
    private int height=165;

    public Person(){

        System.out.println("父类初始化,无参构造器\n");
    }

    public Person(String name){
        this.name=name;
        System.out.println("父类初始化，参数为name\n");

    }
    public  void prvt(){

        System.out.format("父类私有成员变量为%d",height);
    }


    public void rest(){
        System.out.println("l am a person");
    }
}



class Student extends Person{
    int stuid;

    public Student(int stuid){  // 重构父类无参构造器
        super();
        this.stuid=stuid;
    }



    public Student(String name,int stuid){  //重构父类name构造器
        super(name);   //继承了父类的成员变量name
        super.name=name; //给子类继承的成员变量赋值
        this.stuid=stuid; //给子类有的成员变量赋值

    }
    public void study(){
        System.out.println("l am a student");
    }

}
