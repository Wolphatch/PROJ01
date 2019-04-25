package Welcome_JAVA;

public class oop_object {
    public static void main(String[] args){
        oop_object obj=new oop_object();
        System.out.println(obj);   //调用了 object类的to_string方法
        obj.toString();
    }

    @Override
    public String toString(){
        return "Test object to_String";
    }

}
