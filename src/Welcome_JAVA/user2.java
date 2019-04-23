package Welcome_JAVA;

public class user2 {
    int id;
    String name;
    String passwd;
    static String school="monash";

    public user2(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void login(){
        System.out.println("loging in"+name);
    }

    public static void printschool(){
        System.out.println(school);
    }

    public static void main(String[] args){
        user2 wolph=new user2(10001,"wolph");  //实例化user2
        user2.printschool();                //user2的静态方法可以用类直接访问（静态方法与类存储）
        System.out.println(user2.school);   //user2的静态变量可以用类直接访问（静态变量与类存储）
        user2.school="Melbourne";           //静态变量通过访问类来改变
        System.out.println(user2.school);


        wolph.login();                      //实例只能访问非静态变量和方法
        System.out.println(wolph.id);       //如果instances访问静态变量会报错
    }











}
