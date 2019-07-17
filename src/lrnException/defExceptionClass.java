package lrnException;

public class defExceptionClass {
    public  static void main(String[] args) throws IlligalAgeException2 {
        Person p1=new Person();
        p1.setAge(5); //继承RuntimeException
        p1.setHeight(-1);//继承Exception 层层抛出IlligalAgeException2
    }

}

class Person{
    private int age;
    private int height;

    public int getAge(){
        return this.age;
    }

    public  void setAge(int age){
        if (age<0){
            throw new IlligalAgeException("年龄必须大于0");
        }
        else{
            this.age=age;
        }

    }

    public  void setHeight(int height) throws IlligalAgeException2{
        if (height<0){
            try{
                throw new IlligalAgeException2("身高不能小于0");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.height=height;
    }
}




class IlligalAgeException extends RuntimeException{
    public IlligalAgeException(){   //空构造器

    }

    public IlligalAgeException(String msg){
        super(msg);
    }
}
class IlligalAgeException2 extends Exception{
    public IlligalAgeException2(){   //空构造器

    }

    public IlligalAgeException2(String msg){
        super(msg);
    }
}


