package oop_package;

public class oop_vehicle {
    public static void main(String[] args){
        Vehicles car=new Vehicles();

        //car可以访问public Vehicle类的 Brand(public),name(default),color(protected)

        Fighter f22=new Fighter();
        //f22 作为子类对象可以访问Vehicle类的 Brand(public),name(default),color(protected)
    }
}

class Fighter extends Vehicles {

}
