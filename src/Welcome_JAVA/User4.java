package Welcome_JAVA;

public class User4 {
    public static void main(String[] args){
    User4 u1=new User4(100,"WOLPH");
    u1.test(u1);
    System.out.println(u1.name);
    u1.test2(u1);
    System.out.println(u1.name);
    }

    int id;
    String name;
    String pwd;

    public User4(int id, String name){  //init
        this.id=id;
        this.name=name;
        System.out.println("init");
    }

    public  void test(User4 u){  //类似python的self
        u.name="wolph";
    }


    public void test2(User4 u){  //u接收到的是u1地址的拷贝
         u=new User4(1000,"STAR");          //赋予u1新的地址
    }




}
