package Welcome_JAVA;

//子类构造器在类初始化的时候，会先初始化父类中，参数相同的构造器，再初始化自己的

class User extends SuperUser {
    int a;
    String b;
    String c;


    public User(){    //子类构造器
        System.out.println("子类，无参数");
    }

    public User(int userid){    //子类构造器
        super(userid);          //不管声不声明super，都会自动执行super，父类构造函数会先执行
                                //具体执行父类拿个构造器取决于super里面的参数和父类的那个构造函数对应
        super.userid=userid;
        this.a=userid;
        System.out.println("子类+id");
    }

    public User (int userid,String username){
        this(userid);
        this.b= username;
    }


    public User(int userid,String username,String passwd) {
        super(userid, username, passwd);
        super.userid = userid;
        super.username = username;
        super.passwd = passwd;
        this.a = userid;
        this.b = username;
        this.c = passwd;
        System.out.println("继承父类+id+name+passwd");
    }


    void mthd(){
        System.out.println("子类方法");
    }

}





public class SuperUser {
    int userid;
    String username;
    String passwd;



    public SuperUser() {

        System.out.println("父类，无参数");
    }

    public SuperUser(int userid) {

        this.userid=userid;
        System.out.println("父类+id");
    }



    public SuperUser(int userid,String username,String passwd) {   //重写constructor
        this.userid = userid;
        this.username = username;
        this.passwd = passwd;
        System.out.println("父类+id+name+passwd");
    }

    public static void main(String[] args) {
    SuperUser user1=new SuperUser();
    SuperUser user2=new SuperUser(1111);
    SuperUser user3=new SuperUser(1112,"Zaca","123");
    System.out.println("*****************");
    User user4=new User();
    User user5=new User(1113);
    System.out.println(user5.a);
    User user6=new User(1114,"zhico","1234");
    System.out.println(user6.a);
    System.out.println(user6.b);
    System.out.println(user6.c);



    }
}
