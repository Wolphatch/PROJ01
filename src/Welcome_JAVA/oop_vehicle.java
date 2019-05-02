package Welcome_JAVA;

import oop_package.Vehicles;

public class oop_vehicle {


}

class Ship extends Vehicles {
    void print_character(){
        System.out.println(Brand);
        //System.out.println(name);
        System.out.println(color);  //protected 属性可以在外包的子类被继承使用
        //System.out.println(length);
    }
}

