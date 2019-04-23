package Welcome_JAVA;


public class student {


    //field,类变量
    int id;
    String name;
    int age;


    //方法
    void study(){
        System.out.format("%s's name is %s, and his age is %d\n",id,name,age);
    }


    //建立一个子类继承父类student，static使得可以在main里直接实例化
    static class sub_student extends student{
        private int id=1002;
        private int age=19;
        private String name="Zacarais";

        public sub_student(){
            System.out.println("123");
        }

        void study(){
            System.out.format("%s's name is %s, and his age is %d\n",id,name,age);
        }

    }



    public static void main(String[] args) {

        //实例化student
        student hu=new student(); //hu是student的instance

        hu.name="zhicong_hu";   //为实例变量赋值
        hu.id=1001;
        hu.age=18;


        student Zacarais=new sub_student();   // 实例化sub_student1,与类名同名的方法是用来初始化类的，类实例化的时候会自动执行
        //output: 123

    }


}




//建立一个子类继承父类student，不写在父类之内
class sub_student2 extends student {
    private int id = 1003;
    private int age = 20;
    private String name = "Wolph";

    void study() {
        System.out.format("%s's name is %s, and his age is %d\n", id, name, age);
    }
}


