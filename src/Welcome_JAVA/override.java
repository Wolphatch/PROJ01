package Welcome_JAVA;

public class override {//public的class只能有一个
    public  static void main(String[] args){
        Vehicle car= new Vehicle();
        Jet A380=new Jet();
        car.run();
        A380.run();
        Vehicle van=A380.van();
        van.run();
    }
}





class Vehicle{   //control+h 显示继承关系
    public void run(){
        System.out.println("踩油门");
    }
    public  void stop(){
        System.out.println("踩刹车");
    }
    public Vehicle van() {     //返回值是Vahicle的实例
        return new Vehicle();
    }
}

class Jet extends Vehicle {
    public void run(){
        System.out.println("推节流阀");  //子类override父类方法
    }
    public void stop(){
        System.out.println("反推刹车");
    }
    public Vehicle van(){
        return new Jet();   //返回值是Vahicle的实例,如果要求返回子类实例
        //不能返回父类实例,要求父类实例，可以返回子类
        //这里van方法要求返回父类实例，但返回的是子类实例new Jet()，
    }
}


/*
JAVA的方法需要声明返回值类型，如果声明返回父类实例，可以返回父类实例和子类实例
如果声明返回子类实例，则只可以返回子类实例
*/
