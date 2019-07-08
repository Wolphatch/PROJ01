package learn_interface;

public class Test_interface {
    public static void main(String[] args) {
        Volant v1 = new Angel();
        Volant v2= new birdman();   //接口的抽象方法可以由不同实现子类完成 volant--> angel and birdman
        v1.fly();   //Angel can fly
        v2.fly();   //birdman can fly
        Vo_Ho v3= new superman();
        v3.hero();
        v3.fly();
        v3.Help_other();
        int d =v3.roar();
        System.out.println(d);


    }
}
    //飞行接口
interface Volant{
        int FLY_HIGHT=100;   //always public static final int
        void fly();      //always public abstract void fly()
        int roar();     //有返回值的抽象方法
    }
    //善良接口
interface  Honest{
        void Help_other();
    }

interface  Vo_Ho extends Volant,Honest{ //接口多继承
    void hero();
}

class Angel implements Volant,Honest{     //实现类可以实现多个父接口
        public void fly(){
            System.out.println(" Angel can fly");
        }

        public void Help_other(){
            System.out.println("Angel helps others");
        }

        public int roar(){
            return 1;
        }

}


class Goodman implements Honest{
        public void Help_other(){
            System.out.println(" goodman help others");
        }
    }

class birdman implements  Volant{
        public void fly(){
            System.out.println(" birdman can fly");

        }
        public int roar(){
            return 1;
        }
    }
class superman implements Vo_Ho{   //实现类实现子接口的所有方法
    public void fly(){
        System.out.println("Superman is fluying");
    }
    public void Help_other(){
        System.out.println("Superman is helping others");
    }
    public  void hero(){
        System.out.println("Superman is hero");
    }
    public int roar(){
        return 1;
    }
}

