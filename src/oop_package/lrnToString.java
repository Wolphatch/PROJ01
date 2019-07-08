package oop_package;

public class lrnToString {
    public static void main(String[] args){
        picture p1=new picture(2,3);
        System.out.println(p1.toString());
    }


}


class picture extends Object{
    int length;
    int width;

    public picture(int length,int width){
        super();
        this.length=length;
        this.width=width;
    }
}