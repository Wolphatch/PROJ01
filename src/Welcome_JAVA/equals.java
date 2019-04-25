package Welcome_JAVA;

public class equals {
    public static void main(String[] args){
        Persons p1=new Persons(123,"wolph");
        Persons p2=new Persons(123,"Zacarais");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));  //p1和p2 都是person类，
        // equials将实例p2赋值给实例c，用以测试p2的id是否与p1一样
        String s1 =new String("abc");
        String s2=new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));   //String类的equal方法
        /*
        输出为 f，t，f，t，即p1和p2拥有相同的id，但他们不是相同的对象
        s1和s2不相同
         */

    }


}

class Persons{
    int id;
    String name;

    public Persons(int id, String name){
        this.id=id;
        this.name=name;
    }

    public boolean equals(Object obj){        //传入一个类，属性为Object
        if(obj==null){
            return false;
        }

        else{
            if (obj instanceof Persons){    //如果这个传入的类是Persons类
                Persons c=(Persons) obj;    //obj的属性转变成Persons，其实例命名为c，
                                            // 这样做的原因是传入类obj没有id属性，转化为Persons属性才会拥有id属性
                if(c.id==this.id){          //用来测定本实例的id属性与实例c的id是否一致
                   return true;
                }
            }
        }
        return false;
    }

}