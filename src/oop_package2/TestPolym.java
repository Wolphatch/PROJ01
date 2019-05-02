package oop_package2;

class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("喵？");
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.println("汪");
    }
    public void guard(){
        System.out.println("看门。。。");
    }
}




public class TestPolym {
    public static void main(String[] args){
        Animal a1=new Animal();
        animalCry(a1);       //-------->叫了一声
        Dog d=new Dog();   //d 为子类对象
        animalCry(d);  //将子类对象输入需要父类对象的方法--->汪
        Animal c=new Cat();
        animalCry(c);



    }


    static void animalCry(Animal a){  //可以输入父类及子类对象，如果没有多态，animalCry要重写三次
        a.shout();                              //以传入animal，cat，dog
    }                                  //多态通过父类引用指向子类
}
/*
Python由于不需要声明传入值类型，所以多态的体现不是很明显，但是也可以做到相同的效果
 */